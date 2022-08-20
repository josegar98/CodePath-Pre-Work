package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// kotlin file (kt) -  handling user interaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // tap button to change color
        // 1. add a button
        //2. set up logic if user tapped on it
        findViewById<Button>(R.id.button).setOnClickListener {
            //handle button
            // change color
            Log.i("Jose", "Tapped on button")
            // get ref to text view
            // set color
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red))
        //3. if tapped, change the text color


        }
    }
}