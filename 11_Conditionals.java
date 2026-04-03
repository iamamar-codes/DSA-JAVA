import java.util.Scanner;

class Conditionals {
    /*
     * 1. IF - Statement
     * 2. IF-ELSE Statement
     * 3. IF-ELSE-IF Leadder
     * 4. NESTED IF-ELSE
     * 5. TERNARY OPERATOR
     * 6. SWITCH Statement
     */
    public static void main(String[] args) {
        // 1. IF - Statement
        int age = 10;

        if (age >= 18) {
            System.out.println("You are eligible for Job");
        }

        // 2. IF-ELSE Statement
        if (age >= 18) {
            System.out.println("Your Eligible for Vote");
        } else {
            System.out.println("Your Not Eligible for Vote");
        }

        // 3. IF-ELSE-IF Leadder
        int num1 = 20;
        int num2 = 50;
        int num3 = 40;

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is Greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is Greater");
        } else {
            System.out.println("num3 is Greater");
        }

        int day = 16;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednessday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Nothing");
        }

        // 4. NESTED IF-ELSE
        String Surename = "Pandit";
        String subSurename = "Mishra";

        if (Surename == "Pandit") {
            System.out.println("Your are pandit");
            if (subSurename == "Mishra") {
                System.out.println("Mishra Pandit");
            } else {
                System.out.println("Another Pandit");
            }
        } else {
            System.out.println("You are not a Pandit");
            if (subSurename == "Mishra") {
                System.out.println("Your not a pandit but Your Mishra");
            } else {
                System.out.println("not a pandit not a Mishra");
            }
        }

        // 5. TERNARY OPERATOR
        int streakDays = 30;
        // variable //if
        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
        // condition //true //false

        System.out.println(status);

        int Age = 19;
        int ans = (Age > 18) ? 22 : 12;
        System.out.println(ans);

        // 6. SWITCH Statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            default:
                System.out.println("Wrong Choice");
        }

    }
}
