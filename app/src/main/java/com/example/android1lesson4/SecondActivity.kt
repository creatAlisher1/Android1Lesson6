package com.example.android1lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android1lesson4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    private val adapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
        aestheticsList()
    }

    private fun initialize() = with(binding) {
        rvAesthetics.adapter = adapter
        adapter.setAppList(aestheticsList())
    }

    private fun aestheticsList() = listOf(
        Models(R.drawable.img, "Футбол"),
        Models(R.drawable.img_1, "Футбол1"),
        Models(R.drawable.img_2, "Футбол2"),
        Models(R.drawable.img_3, "Футбол3"),
        Models(R.drawable.img_4, "Футбол4"),
        Models(R.drawable.img_5, "Футбол5"),
        Models(R.drawable.img_6, "Футбол6"),
    )
}