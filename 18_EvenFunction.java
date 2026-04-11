class EvenFunction {
    static boolean isEven(int num) {
       return num % 2 == 0;
    }

    public static void main(String[] args) {
        boolean even = isEven(9);
        System.out.println("Entered Number is Even: " + even);
    }
}
