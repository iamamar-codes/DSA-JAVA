import java.util.Scanner;

class lowerToupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Word in Lowercase: ");
        String Word = sc.next();
        System.out.println("Word in Uppercase: "+Word.toUpperCase());
    }
}
