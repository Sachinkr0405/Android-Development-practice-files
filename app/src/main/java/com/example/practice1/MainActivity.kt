package com.example.practice1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val like = findViewById<Button>(R.id.button3)
        val cont = findViewById<Button>(R.id.button4)

        like.setOnClickListener{
            Toast.makeText(applicationContext, "Liked", Toast.LENGTH_SHORT).show()
        }

        cont.setOnClickListener{
            Toast.makeText(applicationContext, "Please Wait...", Toast.LENGTH_LONG).show()
        }


    }
}