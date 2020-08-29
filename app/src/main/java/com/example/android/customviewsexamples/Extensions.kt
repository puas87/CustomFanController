package com.example.android.customviewsexamples

import android.app.Activity
import android.content.Intent

fun Activity.navigateTo(activity: Class<out Activity>) {
    startActivity(Intent(this, activity))
}