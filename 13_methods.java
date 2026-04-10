class methods {
    //NO PARAMETERS
   static void add() {
        int a= 2;
        int b =3;
        int sum = a+b;
        System.out.println(sum);
    }

    //WITH PARAMETERS
    static void printSum(int x, int y){
        System.out.println("Sum: "+ (x + y));
    }

    public static void main(String[] args) {
        add();
        printSum(20, 5);
    }

}
