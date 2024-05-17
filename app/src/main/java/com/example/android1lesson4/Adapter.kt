package com.example.android1lesson4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.android1lesson4.databinding.ItemBinding

class Adapter: RecyclerView.Adapter<Adapter.AestheticsViewHolder>() {

    private var _aestheticList = listOf<Models>()

    fun setAppList(aestheticList: List<Models>) {
        _aestheticList = aestheticList
    }

    inner class AestheticsViewHolder(private val binding: ItemBinding): ViewHolder(binding.root){
        fun onBind(aestheticsModels: Models) {
            binding.imageView.setImageResource(aestheticsModels.image)
            binding.textView.text = aestheticsModels.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AestheticsViewHolder {
        return AestheticsViewHolder(
            ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return _aestheticList.size

    }

    override fun onBindViewHolder(holder: AestheticsViewHolder, position: Int) {
        holder.onBind(_aestheticList[position])
    }
}