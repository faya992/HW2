package com.example.hw2.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.hw2.R

class HelloConstraintActivity : AppCompatActivity() {
    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_constraint)
        mShowCount = findViewById<View>(R.id.show_count_constraint) as TextView
    }

    fun showToast(view: View?) {
        val toast: Toast = Toast.makeText(
            this, R.string.toast_message,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }

    fun countUp(view: View?) {
        mCount++
        if (mShowCount != null) mShowCount!!.text = mCount.toString()
    }

    fun countZero(view: View?) {
        if (mCount > 0) {
            mCount = 0
            mShowCount!!.text = mCount.toString()


        }
    }
}