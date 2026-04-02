import java.util.Scanner;
import java.math.BigInteger;

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

        System.out.println("Enter the value of BigInteger: ");
        BigInteger bg = sc.nextBigInteger();

        System.out.println("Enter the value of flag: ");
        boolean flag = sc.nextBoolean();

        System.out.println("Enter the value of Short: ");
        short shortVal = sc.nextShort();

        System.out.println("Enter the value of floatValue: ");
        float floatValue = sc.nextFloat();

        System.out.println("BigInteger: "+bg);
        System.out.println("Flag: "+flag);
        System.out.println("shortValue: "+shortVal);
        System.out.println("floatValue: "+floatValue);

        sc.close();
        
    }
}