package com.smartherd.msapp

import android.app.Activity
import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String) {        //class Context is super class of Activity
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}