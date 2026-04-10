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
        int a = 4;
        int b = 6;
        int sum = a+b;
        System.out.println("Sum: "+ sum);
    }

    public static void main(String[] args) {

        //call or invoke object
        add();       
        printSum(20, 5);
    }

}

//Methods signature : tell the Return type, Method name and Parameters