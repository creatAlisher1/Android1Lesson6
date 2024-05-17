package com.example.android1lesson4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android1lesson4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val correctPassword = "0000"
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mBtnChek.setOnClickListener {
            val enterPassword = binding.etPassword.text.toString()

            if (enterPassword == correctPassword) {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@MainActivity, "Неверный пароль", Toast.LENGTH_SHORT).show()
            }
        }
    }
}