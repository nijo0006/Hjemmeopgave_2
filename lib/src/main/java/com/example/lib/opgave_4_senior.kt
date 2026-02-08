package com.example.lib

fun main(){
//SENIORLØSNING (samlet forklaring nederst på siden med juniorkoden)

abstract class Shape(
    val color: String,
    val isTransparent: Boolean
) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}
class Circle(
    color: String,
    isTransparent: Boolean,
    private val radius: Double
) : Shape(color, isTransparent) {

    init {
        require(radius > 0)
    }

    override fun calculatePerimeter(): Double =
        2 * Math.PI * radius

    override fun calculateArea(): Double =
        Math.PI * radius * radius
}
class Triangle(
    color: String,
    isTransparent: Boolean,
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) : Shape(color, isTransparent) {

    init {
        require(sideA > 0 && sideB > 0 && sideC > 0)
    }

    override fun calculatePerimeter(): Double =
        sideA + sideB + sideC

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return Math.sqrt(
            s * (s - sideA) * (s - sideB) * (s - sideC)
        )
    }
}}


