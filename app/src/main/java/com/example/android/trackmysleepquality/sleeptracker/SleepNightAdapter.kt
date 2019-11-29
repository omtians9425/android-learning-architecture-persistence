package com.example.android.trackmysleepquality.sleeptracker

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter : RecyclerView.Adapter<TextItemViewHoler> {
    var data = listOf<SleepNight>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: TextItemViewHoler, position: Int) {
        val item = data[position]
        holder.textView.text = item.sleepQuality.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHoler {
        val layoutInflater = LayoutInflater.from(parent.context) // use context of parent(RecyclerView).
        val view = layoutInflater.inflate(R.layout.text_item_view, parent, false) as TextView
        return TextItemViewHolder(view)
    }
}