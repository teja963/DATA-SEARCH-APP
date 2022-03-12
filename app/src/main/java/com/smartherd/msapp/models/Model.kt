package com.smartherd.msapp.models

data class Hobby(var title: String)

object  Supplier{
    val hobbies = listOf(
                 Hobby("Swimming"),
                 Hobby("Playing"),
                 Hobby("Reading"),
                 Hobby("Drawing"),
                 Hobby("Programming"),
                 Hobby("Articles"),
        )
}