package com.smartherd.msapp

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {        //class Context is super class of Activity
    Toast.makeText(this, message, duration).show()
}