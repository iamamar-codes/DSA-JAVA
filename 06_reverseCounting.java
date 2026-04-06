import java.util.Scanner;

class reverseCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Starting number: ");
        int n = sc.nextInt();
        System.out.println("Startinf from "+ n + " to 1 ");
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    }
}
