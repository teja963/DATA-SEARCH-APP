package com.smartherd.msapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class SearchActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val bundle: Bundle? = intent.extras    //using nullable bundle, bcz input can't be null
        val input_message =  bundle!!.getString("input_message")
        Toast.makeText(this, input_message, Toast.LENGTH_SHORT).show()

    }

}