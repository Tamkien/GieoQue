package com.kienct.gieoque.ui.slideshow

import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kienct.gieoque.R
import com.kienct.gieoque.client.DatabaseClient
import com.kienct.gieoque.entities.History

class HistoryFragment : Fragment() {
    lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        getHistory()
        textView = root.findViewById(R.id.text_slideshow)
        return root
    }

    private fun getHistory() {
        var s = ""

        class GetHistory : AsyncTask<Void, Void, List<History>>() {
            override fun doInBackground(vararg p0: Void?): List<History> {
                val db = context?.let { DatabaseClient.getInstance(it).appDatabase.historyDao() }
                val result = db!!.getAllHistories()
                for (r in result)
                    s += (r.toString())
                return db.getAllHistories()
            }

            override fun onPostExecute(result: List<History>?) {
                super.onPostExecute(result)
                textView.text = s
            }
        }

        val ah = GetHistory()
        ah.execute()
    }
}