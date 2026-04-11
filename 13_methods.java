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
        System.out.println("Ans1 :" + (p+q) );
        return sum;
    }

    //Method Overloading : same name but different method signature
    static int adding(int x, int y, int z){
        int sum  = x + y + z;
        System.out.println("Ans2 :" + (x+y+z));
         return sum;
    }

    static boolean isEligiableForVote(int age){
        return age >= 18;
    }

    static void solve(int num){
        System.out.println("inside solve: " + num);
        num = num * 10;
        System.out.println("inside solve : " + num);
    }

    static void printMultiples(){
        int value = 10;
        for(int i=1; i <= 10; i++){
            System.out.println(10*i);
        }
       // System.out.println(value);
    }


    public static void main(String[] args) {

        //call or invoke object
        add();       
        printSum(20, 5);
        adding(5, 8);
        adding(12, 7, 6);
        boolean eligible = isEligiableForVote(17);
        System.out.println("Eligible for Voting: " + eligible);

        //call by Value
        int num  =5;
        System.out.println("inside main : " + num);
        solve(num);
        System.out.println("inside main : " + num);

        printMultiples();

    }

}

//Methods signature : tell the Return type, Method name and Parameters