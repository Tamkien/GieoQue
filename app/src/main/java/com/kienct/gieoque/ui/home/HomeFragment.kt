package com.kienct.gieoque.ui.home

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kienct.gieoque.R
import com.kienct.gieoque.VietCalendar
import com.kienct.gieoque.client.DatabaseClient
import com.kienct.gieoque.entities.Hexagram
import com.kienct.gieoque.entities.History
import com.kienct.gieoque.entities.Millisecond
import com.kienct.gieoque.ui.ResultActivity
import java.text.SimpleDateFormat
import java.util.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val btnCalculate = root.findViewById<Button>(R.id.btnCalculate)
        btnCalculate.setOnClickListener {
            val date = Date()
            val ms = Millisecond(date.time.toString())
            val queChuID = ms.gieoQueChu()
            val timeZone = 7.0
            val julianDate = VietCalendar.jdFromDate(date.date, date.month + 1, date.year + 1900)
            val s = VietCalendar.jdToDate(julianDate)
            val l = VietCalendar.convertSolar2Lunar(s[0], s[1], s[2], timeZone)
            val s2 = VietCalendar.convertLunar2Solar(l[0], l[1], l[2], l[3], timeZone)
            val intent = Intent(this.context, ResultActivity::class.java)
            val sDate = SimpleDateFormat("HH:mm:ss dd/MM/yyyy").format(date)
            intent.putExtra("solarCal", sDate)
            val lDate: String = if (s[0] == s2[0] && s[1] == s2[1] && s[2] == s2[2]) {
                l[0].toString() + "/" + l[1] + "/" + l[2] + if (l[3] == 0) "" else " nhuận"
            } else {
                "ERROR! " + s[0] + "/" + s[1] + "/" + s[2] + " -> " + l[0] + "/" + l[1] + "/" + l[2] + if (l[3] == 0) "" else " nhuận"
            }
            intent.putExtra(
                "lunarCal",
                lDate
            )
            val hexagrams = Hexagram().getAllHexes()
            for (h in hexagrams) {
                if (h.id == queChuID) {
                    intent.putExtra("name", h.name)
                    intent.putExtra("imgSrc", h.imgSrc)
                    intent.putExtra("desc", h.description)
                    addHistory(History(0, queChuID, h.name, sDate, lDate))
                    break
                }
            }
            startActivity(intent)
        }
        return root
    }

    private fun addHistory(history: History) {
        class AddHistory : AsyncTask<Void, Void, Void>() {
            override fun doInBackground(vararg p0: Void?): Void? {
                val db = context?.let { DatabaseClient.getInstance(it).appDatabase.historyDao() }
                db?.insert(history)
                return null
            }
        }
        val ah = AddHistory()
        ah.execute()
    }
}