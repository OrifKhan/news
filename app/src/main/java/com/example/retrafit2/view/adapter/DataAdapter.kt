package com.example.retrafit2.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.retrafit2.R
import com.example.retrafit2.databinding.ItemLayoutBinding
import com.example.retrafit2.madel.data.Data
import com.squareup.picasso.Picasso

class DataAdapter : ListAdapter<Data, DataAdapter.CoinViewHolder>(MyDiffUtil()) {
    var onClick: (Int) -> (Unit) = { }

    inner class CoinViewHolder(itemView: View) : ViewHolder(itemView) {
        private val binding = ItemLayoutBinding.bind(itemView)

        init {
            binding.root.setOnClickListener {
                onClick(adapterPosition)
            }
        }

        fun bind(data: Data) {
            Picasso.get().load(data.icon).into(binding.icon)
            binding.textName.text = data.name
            binding.textEndData.text = data.endDate
            binding.textStartData.text = data.startDate
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        return CoinViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}