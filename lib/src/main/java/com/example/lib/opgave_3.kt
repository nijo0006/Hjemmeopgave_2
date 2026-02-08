package com.example.lib

//Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory.
// Subclass it to create specific product types like Shoe, T-shirt, and Book. Override the function such that:
//The shoe outputs "I am a shoe" .
//The T-shirt outputs "I am a T-shirt"
//The book outputs "I am a book"

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
