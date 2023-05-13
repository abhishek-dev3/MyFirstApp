package com.abhi.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.button1);
        val b2 = findViewById<Button>(R.id.button2);
        val t2 = findViewById<TextView>(R.id.textView2);

        next.setOnClickListener {

            val homeaccess = Intent(this, HomeActivity::class.java)
            startActivity(homeaccess)

        }

        b2.setOnClickListener{
             finish()
        }


    }
}