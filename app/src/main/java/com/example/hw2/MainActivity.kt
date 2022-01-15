package com.example.hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.hw2.lesson1.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Activity", "Hello MainActivity")
    }

    fun startHelloWorldActivity(view: View?) {
        startActivity(Intent(this, HelloWorldActivity::class.java))
    }

    fun startHappyBirthdayActivity(view: View?) {
        startActivity(Intent(this, HappyBirthdayActivity::class.java))
    }

    fun startHelloToastActivity(view: View?) {
        startActivity(Intent(this, HelloToastActivity::class.java))
    }

    fun startHelloToastChallengeActivity(view: View?) {
        startActivity(Intent(this, HelloToastChallengeActivity::class.java))
    }

    fun startHelloConstraintActivity(view: View?) {
        startActivity(Intent(this, HelloConstraintActivity::class.java))
    }

    fun startScrollingTextActivity(view: View?) {
        startActivity(Intent(this, ScrollingTextActivity::class.java))
    }
}