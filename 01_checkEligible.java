import java.util.Scanner;

class checkEligible{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible for Vote ");
        }
    }
}