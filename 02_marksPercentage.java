import java.util.Scanner;

class marksPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks for Student");
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double Percentage = total / 5;
        System.out.println("Percentage of student: " + Percentage + "%");
    }
}