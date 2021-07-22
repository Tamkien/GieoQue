package com.kienct.gieoque.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kienct.gieoque.Milisecond
import com.kienct.gieoque.R
import com.kienct.gieoque.ui.slideshow.SlideshowViewModel

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
            val ms = Milisecond(System.currentTimeMillis().toString())
            val queChuID = ms.gieoQueChu()
            val queHoID: String =
                    queChuID[4].toString() + queChuID[3].toString() + queChuID[2].toString() + queChuID[3].toString() + queChuID[2].toString() + queChuID[1].toString()
            Log.d("kienct", "$queChuID $queHoID")
        }
        return root
    }
}