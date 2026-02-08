package com.example.lib

//✅Create a new class called Computer. Before you add any more code, know that you will need to add two additional classes: Laptop and SmartPhone
//✅For a parent class add 3 properties, 2 methods, and a constructor.
//✅For a child class add at least 1 additional property and 1 additional method.
//✅In the main method create a Laptop and a SmartPhone

//BASECLASS
open class Computer(
    //3 properties
    val brand: String,
    var price: Int,
    var color: String
) {
    //2 methods
    open fun checkBattery(): String {
        return "Checking battery"
    }
    open fun calculateDiscount(): String {
        return "Calculation discout"
    }
}

//SUBCLASS
// 1 ny property
open class LapTop(
    brand: String,
    price: Int,
    color: String,
    val size: Float
) : Computer(brand, price, color) {

    // 1 ny method
    override fun checkBattery(): String {
        return "Checking the battery"
    }

    fun changeColor(): String{
        color == "Blue"
        return "The color is now Blue"
    }

//SUBCLASS
    // 1 ny property = isLocked - står længere nede da den skal være fast på true
class SmartPhone(
    brand: String,
    price: Int,
    color: String,

): Computer(brand, price, color, ) {
    val isLocked: Boolean = true

    override fun checkBattery(): String {
        return "Battery is checked"
    }

        fun changeBackground(): String {
            return "The background has been changed to lots of kittens"
        }
    }
}
