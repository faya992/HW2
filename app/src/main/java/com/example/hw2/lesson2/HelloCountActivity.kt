package com.example.hw2.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hw2.R

class HelloCountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_count)
        val helloCountTextView: TextView = findViewById(R.id.helloCountTextView)
        helloCountTextView.text = intent.getStringExtra(HelloToastActivity2.EXTRA_COUNTER)
    }
}