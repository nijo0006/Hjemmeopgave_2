
    //✅Create a class called Employee that includes three pieces of information as instance variables
    //A first name
    //A last name
    //A monthly salary
    //✅Your class should have a constructor that initializes the three instance variables.
    //✅If the monthly salary is not positive, set it to 0.0.
    //✅Create two Employee objects and display each object’s yearly salary.
    //✅Then give each Employee a 10% raise and display each Employee’s yearly salary again.

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
       //✅Then give each Employee a 10% raise and display each Employee’s yearly salary again.
       fun raiseSalary(): Float{
           val raiseSalary: Float = monthlySalary * 1.1f
           return raiseSalary

       }

       override fun toString(): String {
           return "Employee(firstName='$firstName', lastName='$lastName', monthlySalary=$monthlySalary)"
       }


   }


