package com.example.hw2.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hw2.R

class HappyBirthdayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happy_birthday)
        Log.d("Activity", "Hello HappyBirthdayActivity")
    }
}