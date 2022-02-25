package com.smartherd.msapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {                          //First we need to initialize it

    override fun onCreate(savedInstanceState: Bundle?) {           //We need to choose on create fun with single parameter
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)                     //We need to connect activity_main to MainActivity through setcontent

        button_show_toast.setOnClickListener {
            Log.i("MainActivity", "Show Toast Pressed")   //For testing purpose
            Toast.makeText(this, "Show Toast", Toast.LENGTH_SHORT).show() //To display the popup notifications
        }

        button_search.setOnClickListener {
            Log.i("MainActivity","Search Pressed")
            val message: String = input_text.text.toString()   //Taking input from user
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent =  Intent(this, SearchActivity::class.java)             //To go from one activity to another activity
            startActivity(intent)                                                           //It will start the activity
        }


    }

}