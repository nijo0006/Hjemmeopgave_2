// package com.example.lib - det her ville jeg umiddelbart lade stå, men så virker koden ikke :((

   class Employee(
        public val firstName: String,
        public val lastName: String,
        public var monthlySalary: Float
    ) {
       init {
           if (monthlySalary < 0) {
               this.monthlySalary = 0.0f
           }
       }

       fun raiseSalary(): Float{
           val raiseSalary: Float = monthlySalary * 1.1f
           return raiseSalary

       }

       override fun toString(): String {
           return "Employee(firstName='$firstName', lastName='$lastName', monthlySalary=$monthlySalary)"
       }

   }


