package com.example.myfirstmobileapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


// This Kotlin file is where we are going to be handling user interaction
class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // Get a reference to the button
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.textView).setTextColor(R.color.black)
        }
        // change background color
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<ConstraintLayout>(R.id.layout).setBackgroundColor(R.color.teal_200)
        }

        // change text
        findViewById<Button>(R.id.button3).setOnClickListener {
            val changedText: String = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            if (changedText != "") {
                findViewById<TextView>(R.id.textView).text = changedText
            } else {
                findViewById<TextView>(R.id.textView).text = "Hello from Minh"
            }
            findViewById<EditText>(R.id.editTextTextPersonName).setText("")
        }

    }
}