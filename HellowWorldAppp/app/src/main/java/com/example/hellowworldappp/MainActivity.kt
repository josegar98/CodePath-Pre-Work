package com.example.hellowworldappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // show this layout file
        setContentView(R.layout.activity_main)

        //Add a button


        //Logic for when button is pressed
        findViewById<Button>(R.id.button).setOnClickListener{
            //change color of text
            Log.i("Jose", "Tapped on button")

            //set the new color
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.purple_500))

        }
    }
}