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

    //Non Void function: return something
    static int adding (int p, int q){
        int sum = p+q;
        System.out.println("Sum:" + (p+q) );
        return sum;
    }

    static boolean isEligiableForVote(int age){
        return age >= 18;
    }

    public static void main(String[] args) {

        //call or invoke object
        add();       
        printSum(20, 5);
        adding(5, 8);
        boolean eligible = isEligiableForVote(17);
        System.out.println("Eligible for Voting: " + eligible);
    }

}

//Methods signature : tell the Return type, Method name and Parameters