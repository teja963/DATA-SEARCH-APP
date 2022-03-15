package com.smartherd.msapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.smartherd.msapp.R
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

        button_save.setOnClickListener {
            Log.i(TAG, "Save Button")
            /* Taking input from user*/
            val rollInput: String = input_roll.text.toString()
            val nameInput: String = input_name.text.toString()
            val phoneInput: String = input_phone_number.text.toString()
            val branchInput: String = input_branch.text.toString()

            saveFirestore(rollInput, nameInput, phoneInput, branchInput)
//            val intent = Intent(this, SearchActivity::class.java) //Our intention is to move from one page(Explicit Intent) to another by kotlin reflection
//            intent.putExtra(Constants.USER_MSG, message)  //loading message into intent
//            startActivity(intent)
        }

//        button_share.setOnClickListener {
//            val message: String = input_roll.text.toString()
//            val intent = Intent()
//            intent.action = Intent.ACTION_SEND
//            intent.putExtra(Intent.EXTRA_TEXT, message)        //this is implicit intent so need to use EXTRA_TEXT
//            intent.type = "text/plain"      //you should mention this for type of apps applicable to
//            startActivity(Intent.createChooser(intent, "Share to:"))
//        }

    }

    private fun saveFirestore(rollInput: String, nameInput: String, phoneInput: String, branchInput: String) {

    }
}
