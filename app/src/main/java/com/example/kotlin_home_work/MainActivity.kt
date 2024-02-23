package com.example.kotlin_home_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Button1 (view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
        finish()
}
}