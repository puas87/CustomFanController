package com.example.android.customviewsexamples.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.customviewsexamples.R
import com.example.android.customviewsexamples.databinding.ActivityMainBinding
import com.example.android.customviewsexamples.navigateTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.buttonDial.setOnClickListener { navigateTo(DialActivity::class.java) }
        binding.buttonMiniPaint.setOnClickListener { navigateTo(MiniPaintActivity::class.java) }
    }
}