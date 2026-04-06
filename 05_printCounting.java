import java.util.Scanner;
class Counting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        System.out.println("Counting from 1 to " + n);
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}