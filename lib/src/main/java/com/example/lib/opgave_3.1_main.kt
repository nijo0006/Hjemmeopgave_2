package com.example.lib

fun main(){
    // Shoe
    val shoe: Product = Shoe("Nike", 30, 2)
    println(shoe.identifyProductCategory())

    //T-Shirt
    val Tshirt: Product = Tshirt("Weekday", 25, 5)
    println(Tshirt.identifyProductCategory())

    //Book
    val book: Product = Book("1964", 25, 5)
    println(book.identifyProductCategory())
}