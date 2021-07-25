package com.kienct.gieoque.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kienct.gieoque.R
import com.kienct.gieoque.VietCalendar
import com.kienct.gieoque.entities.Millisecond
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
            val queHoID: String =
                    queChuID[4].toString() + queChuID[3].toString() + queChuID[2].toString() + queChuID[3].toString() + queChuID[2].toString() + queChuID[1].toString()
            Log.d("kienct", "$queChuID $queHoID")
            Log.d("kienct", SimpleDateFormat("HH:mm:ss dd/MM/yyyy").format(date))
            val timeZone = 7.0
            val julianDate = VietCalendar.jdFromDate(date.date, date.month + 1, date.year + 1900)
            val s = VietCalendar.jdToDate(julianDate)
            val l = VietCalendar.convertSolar2Lunar(s[0], s[1], s[2], timeZone)
            val s2 = VietCalendar.convertLunar2Solar(l[0], l[1], l[2], l[3], timeZone)
            if (s[0] == s2[0] && s[1] == s2[1] && s[2] == s2[2]) {
                Log.d("amlich", "OK! " + s[0] + "/" + s[1] + "/" + s[2] + " -> " + l[0] + "/" + l[1] + "/" + l[2] + if (l[3] == 0) "" else " nhuận")
            } else {
                Log.d("amlich", "ERROR! " + s[0] + "/" + s[1] + "/" + s[2] + " -> " + l[0] + "/" + l[1] + "/" + l[2] + if (l[3] == 0) "" else " nhuận")
            }

        }
        return root
    }
}