import java.util.Scanner;

class uppertolower{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your word in Uppercase");
        String Word = sc.next();
        System.out.println("Word in Lowercase: "+Word.toLowerCase());
    }
}