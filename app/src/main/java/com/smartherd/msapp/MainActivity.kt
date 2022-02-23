package com.smartherd.msapp

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
            //After clicking button this fun works
            Log.i("MainActivity", "Show Toast Pressed")

            Toast.makeText(this, "Show Toast Pressed", Toast.LENGTH_SHORT).show() //To display the pop of button


        }
    }

}