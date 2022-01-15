package com.example.hw2.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.hw2.R

class HelloToastActivity2 : AppCompatActivity() {
    companion object { val EXTRA_COUNTER = "extra.COUNTER" }
    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_toast2)
        mShowCount = findViewById<View>(R.id.show_count_v2) as TextView
    }

    fun sayHello(view: View?) {
        val intent = Intent(this, HelloCountActivity::class.java)
            .putExtra(EXTRA_COUNTER, mShowCount?.text)
        startActivity(intent)
    }

    fun countUp(view: View?) {
        mCount++
        if (mShowCount != null) mShowCount!!.text = mCount.toString()
    }
}