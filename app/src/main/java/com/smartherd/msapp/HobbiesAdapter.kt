package com.smartherd.msapp

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.view.*

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyviewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyviewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.activity_list, p0, false) //LayoutInflatter - this a class which can create a view element from the layout files content
       return MyviewHolder(view)                                                                 //first item is layout second item is parent present here
    }

    override fun getItemCount(): Int {         //get length of hobbies list
        return hobbies.size
    }
    override fun onBindViewHolder(p0: MyviewHolder, p1: Int) {   //for binding all the data that created in the view
        val hobby = hobbies[p1]
        p0.setData(hobby, p1)           //setData suggestion comes from inner class implementation
    }


    inner class MyviewHolder(itemView: View): RecyclerView.ViewHolder(itemView){   //inorder to bind the data each of the view we have MyviewHolder class
        var currentHobby: Hobby? = null
        var currentPosition: Int = 0
        init {
            itemView.setOnClickListener {
                Toast.makeText(context,currentHobby!!.title + " Clicked!!", Toast.LENGTH_SHORT).show()
            }
        }

        fun setData(hobby: Hobby?, pos: Int){     //Hobby? nullable
            itemView.txvTitle.text = hobby!!.title    //each list layout its representing

            this.currentHobby = hobby
            this.currentPosition = pos
        }
    }

}