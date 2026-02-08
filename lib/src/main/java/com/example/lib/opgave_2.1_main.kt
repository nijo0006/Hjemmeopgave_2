package com.example.lib

fun main(){

    //LapTop
    val laptop: Computer = LapTop("Apple", 2000, "Green", 14.2f)
  println(laptop.checkBattery())

    //SmartPhone
    val smartphone: Computer = LapTop.SmartPhone("Samsung", 1300, "Teal")
println(smartphone.checkBattery())
}
