package com.smartherd.msapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.smartherd.msapp.R
import com.smartherd.msapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {                          //First we need to initialize it
    companion object{
        val TAG: String = MainActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {           //We need to choose on create fun with single parameter
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)                     //We need to connect activity_main to MainActivity through setcontent

        button_recycler_view.setOnClickListener {
            Log.i(TAG,"Recycler Button")
            val intent = Intent(this, RecycleActivity::class.java)
            startActivity(intent)
        }

        button_display.setOnClickListener {
            Log.i(TAG, "Display Button")          //Debugging purpose
            showToast("Display Pressed!!", Toast.LENGTH_LONG)   //Implemented using extensions
        }

        button_search.setOnClickListener {
            Log.i(TAG, "Search Button")

            val message: String = user_input.text.toString()   //use button_id to take input
            val intent = Intent(this, SearchActivity::class.java) //Our intention is to move from one page(Explicit Intent) to another by kotlin reflection
            intent.putExtra("input_message", message)  //loading message into intent
            startActivity(intent)
        }

        button_share.setOnClickListener {
            var message: String = user_input.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)        //this is implicit intent so need to use EXTRA_TEXT
            intent.type = "text/plain"      //you should mention this for type of apps applicable to
            startActivity(Intent.createChooser(intent, "Share to:"))
        }

    }
}
