package com.kienct.gieoque.ui

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kienct.gieoque.R
import com.kienct.gieoque.entities.Hexagram

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvSolarDate = findViewById<TextView>(R.id.txtSolarCalendar)
        tvSolarDate.text = intent.getStringExtra("solarCal")
        val tvLunarDate = findViewById<TextView>(R.id.txtLunarCalendar)
        tvLunarDate.text = intent.getStringExtra("lunarCal")
        val ivHexImage = findViewById<ImageView>(R.id.ivHexImage)
        ivHexImage.setImageResource(intent.getIntExtra("imgSrc", 0))
        val tvHexName = findViewById<TextView>(R.id.txtHexName)
        tvHexName.text = intent.getStringExtra("name")
        val tvHexDescription = findViewById<TextView>(R.id.txtHexDescription)
        tvHexDescription.text = intent.getStringExtra("desc")
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener { finish() }
    }
}