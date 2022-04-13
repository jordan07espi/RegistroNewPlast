package com.example.registronewplast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.buttonIn)
        btn.setOnClickListener {
            val intent: Intent= Intent(this, Login_NewpPlast:: class.java)
            startActivity(intent)

        }

        }
    }
