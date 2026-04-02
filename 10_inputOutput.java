import java.util.Scanner;

class inputOutput{
    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;
        System.out.println(a+b);*/


        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Your firstNumber: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Your secondNumber");
        int secondNumber = sc.nextInt();

        int total = firstNumber + secondNumber;

        System.out.println("Total: "+total);
    }
}