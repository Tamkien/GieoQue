package com.kienct.gieoque.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gieoque.R
import com.kienct.gieoque.entities.Hexagram
import com.kienct.gieoque.entities.History
import com.kienct.gieoque.ui.ResultActivity

class HistoryAdapter(private val list: List<History>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_history, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        if (holder is ViewHolder) {
            holder.bind(item)
            holder.itemView.setOnClickListener {
                var hex = Hexagram()
                for (h in hex.getAllHexes()) {
                    if (h.id == item.hexID) {
                        hex = h
                        break
                    }
                }
                val intent = Intent(it.context, ResultActivity::class.java)
                intent.putExtra("name", item.hexName)
                intent.putExtra("imgSrc", hex.imgSrc)
                intent.putExtra("solarCal", item.sDate)
                intent.putExtra("lunarCal", item.lDate)
                intent.putExtra("desc", hex.description)
                it.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: History) {
            val name: TextView = itemView.findViewById(R.id.tvHistoryName)
            val date: TextView = itemView.findViewById(R.id.tvHistoryDate)
            name.text = item.hexName
            date.text = item.sDate
        }

    }
}