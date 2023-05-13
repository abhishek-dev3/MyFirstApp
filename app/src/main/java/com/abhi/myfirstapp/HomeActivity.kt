package com.abhi.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val b3 = findViewById<Button>(R.id.see_btn);

        b3.setOnClickListener{
            finish()
        }
    }
}