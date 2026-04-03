class Conditionals {
    /*1. IF - Statement
    2. IF-ELSE Statement
    3. IF-ELSE-IF Leadder
    4. NESTED IF-ELSE
    5. TERNARY OPERATOR
    6. SWITCH Statement */
    public static void main(String[] args) {
        //1. IF - Statement
        int age = 10;

        if(age >= 18){
            System.out.println("You are eligible for Job");
        }


        //2. IF-ELSE Statement
        if(age >= 18){
            System.out.println("Your Eligible for Vote");
        }
        else{
            System.out.println("Your Not Eligible for Vote");
        }


        //3. IF-ELSE-IF Leadder
        int num1= 20;
        int num2= 50;
        int num3 = 40;

        if(num1>num2 && num1>num3){
            System.out.println("num1 is Greater");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("num2 is Greater");
        }
        else{
            System.out.println("num3 is Greater");
        }


        int day = 16;

        if(day == 1){
            System.out.println("Monday");
        }
        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("Wednessday");
        }
        else if(day == 4){
            System.out.println("Thursday");
        }
        else if(day == 5){
            System.out.println("Frienday");
        }
        else if(day == 6){
            System.out.println("Saturday");
        }
        else if(day == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Nothing");
        }


    }
}
