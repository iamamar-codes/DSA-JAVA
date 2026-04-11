class halfSquer {
    public static void main(String[] args) {
        //for each row
        for (int i = 1; i <= 5; i++) {

            //for each column
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
