package com.example.retrafit2.view.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.retrafit2.madel.data.Data

class MyDiffUtil:DiffUtil.ItemCallback<Data>() {
    override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean = oldItem== newItem

    override fun areContentsTheSame(oldItem: Data, newItem: Data):Boolean = oldItem == newItem
}

