import java.util.Scanner;
class sumOfnumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no = sc.nextInt();
        for(int i=1; i<=no; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
