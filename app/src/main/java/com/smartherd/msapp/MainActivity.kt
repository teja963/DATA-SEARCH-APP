package com.smartherd.msapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity: AppCompatActivity() {                          //First we need to initialize it
    override fun onCreate(savedInstanceState: Bundle?) {           //We need to choose on create fun with single parameter
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)                     //We need to connect activity_main to MainActivity through setcontent
    }


}