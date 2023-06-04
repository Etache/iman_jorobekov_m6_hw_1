package com.example.m6_hw_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m6_hw_1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickers()
    }

    private fun initClickers() {
        binding.etSecond.setText(intent.getStringExtra("sss"))

        binding.btnSecond.setOnClickListener{
            val intent = Intent()
            intent.putExtra("text", binding.etSecond.text.toString())
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}