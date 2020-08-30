package com.example.android.customviewsexamples.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.customviewsexamples.view.ClippedView

class ClippingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ClippedView(this))
    }
}