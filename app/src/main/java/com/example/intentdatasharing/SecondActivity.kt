package com.example.intentdatasharing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentdatasharing.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name").toString()
        val email = intent.getStringExtra("email").toString()

        binding.nameDisplay.text = name
        binding.emailDisplay.text = email

    }
}