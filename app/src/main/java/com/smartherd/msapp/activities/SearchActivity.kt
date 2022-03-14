package com.smartherd.msapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.smartherd.msapp.Constants
import com.smartherd.msapp.R
import com.smartherd.msapp.showToast
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        /*Using Safe call protocol to avoid null pointer exceptions
            Safe Call ?.
            Safe Call let ?.{ }
        */

        val bundle: Bundle? = intent.extras    //using nullable bundle, bcz input can't be null
         /* It will execute only for non-nullable strings to avoid exceptions*/
        bundle?.let{
            val input_message =  bundle.getString(Constants.USER_MSG)
            if (input_message != null) {
                showToast(input_message)
            }    //Implemented using extensions
            view_input_message.text = input_message
        }
    }
}
