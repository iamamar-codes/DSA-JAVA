class Operators {
     //Operator: just an special symbol that perform a operation with the values or variables
     // example 2 + 3 = 5

     
    /*Types of Operators: 
        1. Artihmetic Operators +, -, *, /, %
        2. relational Operaators ==, !=, >, <, >=, <=
        3. Logical Operators &&(AND), ||(OR), !(NOT) 
        4. Assignment Operators =, +=, -=, *=, /=, %=
        5. Unar INC/ DEC Operators +, -, ++, --
        6. Bitwise Operators
    */
   public static void main(String[] args) {
        int solvedThisWeek = 25;
        int solvedLastWeek = 10;

        //1. Artihmetic Operators

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int Projected = solvedThisWeek * 2;
        int average = solvedThisWeek / 2;
        int remainder = solvedThisWeek % 2;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(Projected);
        System.out.println(average);
        System.out.println(remainder);


        //2. Relational Operaators

        char currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);


        //3. Logical Operators
  
        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);


        //4. Assignment Operators

        int ratingPoints = 100;

        ratingPoints += 10;
        System.out.println(ratingPoints);
         ratingPoints -= 10;
        System.out.println(ratingPoints);
         ratingPoints *= 10;
        System.out.println(ratingPoints);
         ratingPoints /= 10;
        System.out.println(ratingPoints);
         ratingPoints %= 10;
        System.out.println(ratingPoints);



        //5. Unar INC/ DEC Operators

        int number = 10; 
    
        //Pre-increment: first Increament, then Use 11
        int prefix = ++number;
        //Post-increment: first Use, then Increament 10
        int postfix = number --;
       
        System.out.println(prefix);
        System.out.println(postfix);


        //Pre-decrement: first Decreament, then Use 9
       // System.out.println(--number);

        //Post-Decrement: first Use, then Decreament 10
        //System.out.println(number--);


        //6. Bitwise Operators

    }
}
