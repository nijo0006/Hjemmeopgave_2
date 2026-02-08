package com.example.lib

open class Product(
    val name: String,
    val price: Int,
    val quantity: Int
){
    open fun identifyProductCategory(): String{
        return "The product is in a category"
    }
}

class Shoe(
    name: String,
    price: Int,
    quantity: Int) : Product(name, price, quantity
    ){
    override fun identifyProductCategory(): String {
        return "I am a shoe"
    }
}

class Tshirt(
    name: String,
    price: Int,
    quantity: Int) : Product(name, price, quantity
){
    override fun identifyProductCategory(): String {
        return "I am a T-shirt"
    }
}
class Book(
    name: String,
    price: Int,
    quantity: Int) : Product(name, price, quantity
){
    override fun identifyProductCategory(): String {
        return "I am a Book"
    }
}
