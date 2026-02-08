package com.example.lib

import Employee

fun main() {
    var employee1 = Employee("Erik", "Poulsen", 20000f)
    println("${employee1.firstName}'s salary is currently: ${employee1.monthlySalary}")

    var employee2 = Employee("Sigurd", "Rasmussen", 30000f)
    println("${employee2.firstName}'s salary is currently: ${employee2.monthlySalary}")

    println("${employee1.firstName}'s new salary is ${employee1.raiseSalary()} after the 10% raise")

    println("${employee2.firstName}'s new salary is ${employee2.raiseSalary()} after the 10% raise")

    }


