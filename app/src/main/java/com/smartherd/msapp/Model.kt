package com.smartherd.msapp

data class Hobby(var title: String)

object  Supplier{
    val hobbies = listOf<Hobby>(
                 Hobby("Swimming"),
                 Hobby("Playing"),
                 Hobby("Reading"),
                 Hobby("Drawing"),
                 Hobby("Programming"),
                 Hobby("Articles"),
        )
}