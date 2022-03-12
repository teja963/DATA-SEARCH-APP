package com.smartherd.msapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.smartherd.msapp.adapters.HobbiesAdapter
import com.smartherd.msapp.R
import com.smartherd.msapp.models.Supplier
import kotlinx.android.synthetic.main.activity_recycle.*

class RecycleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        setUprecyclerview()
    }

    private fun setUprecyclerview() {
        val layoutManager = LinearLayoutManager(this)   //assign the layout
        layoutManager.orientation = LinearLayoutManager.VERTICAL  //we r setting orientation
        view_recycler.layoutManager = layoutManager
        val adapter = HobbiesAdapter(this, Supplier.hobbies)  //from Hobbies Adapter and Model.kt
        view_recycler.adapter = adapter  //view_recycler getting from acitviy_recylce xml file

    }
}
