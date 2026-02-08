package com.example.lib

// JUNIOR LØSNING (samlet forklaring nederst på denne side)
fun main(){

abstract class Shape(
    val color: String,
    val isTransparent: Boolean
) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}
class Circle(
    private val radius: Double,
    color: String,
    isTransparent: Boolean
) : Shape(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}
class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double,
    private val height: Double,
    color: String,
    isTransparent: Boolean
) : Shape(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    override fun calculateArea(): Double {
        return (sideA * height) / 2
    }
}}

//FORKLARING

//Math.PI: Jeg måtte undersøge dette, og det er bare en indbygget konstant til udregning ift. cirkler,
// hvilket jo giver god mening. Det bruger begge koder.
//https://www.w3schools.com/jsreF/jsref_pi.asp

//Require: denne fra seniorkoden kendte jeg ikke. Det betyder bare, at koden kun skal køre, hvis
//betingelsen opfyldes: i det her tilfælde er det hvis radiussen er over 0. Ellers skriver den IllegalArgumentException.
//https://medium.com/@nunukim/kotlin-validation-check-and-require-9b7c6e984f6b

//Jeg synes egentligt, at denne her kode er ret god og overskuelig, og jeg kan ikke se den store
//forskel på denne her og seniorkoden.Så vidt jeg kan se, vil begge koder køre og virke,
//så det handler nok mest om sikkerheden ift. require.

//Juniorkoden laver også en variabel til height, og det gør senior ikke. Mindre inputs giver
//umiddelbart mindre mulighed for fejl. Samtidig bliver udregningen af calculateArea mere
//indviklet, men stadig mere sikker. Så æstetisk, ser junior flottere ud synes jeg,
//men jeg kan godt se, at seniorkoden nok er mere sikker ift. udregningen af denne.
