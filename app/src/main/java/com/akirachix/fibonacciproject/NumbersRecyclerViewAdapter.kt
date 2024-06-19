package com.akirachix.fibonacciproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViewAdapter(var number:List<Int>) :
    RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_items,
        parent,false)

        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNums.text = number[position].toString()
    }

    override fun getItemCount(): Int {
        return number.size
    }
}


class NumbersViewHolder(itemView:View):
                RecyclerView.ViewHolder(itemView){
            var tvNums = itemView.findViewById<TextView>(R.id.tvNums)
                }