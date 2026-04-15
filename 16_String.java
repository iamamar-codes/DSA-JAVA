import java.util.Scanner;

class StringDemo {
    public static void main(String[] args) {
        String firstName = "Amar";
        String lastName = "Kushwaha";

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        System.out.println(lastName.length());
        System.out.println(firstName.charAt(0));



        //COMPARING STRING-------------------------------------------------

        // 1. == (double equals)
        String name1 = "Amar";
        String name2 = "amar";
        if(name1 == name2){
            System.out.println("Both Are same");
        }
        else{
            System.out.println("Both are not same");
        }
        /*== not comapring values, it compares the address of 
        String Variable in String pool*/


        //2 .equals()
        if(name1.equals(name2)){
            System.out.println("Both Are same");
        }
        else{
            System.out.println("Both are not same");
        }
        /*.equal() checks the contant and it is a case sensitive */

        //3 .equalIgnoreCase() 
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Both Are same");
        }
        else{
            System.out.println("Both are not same");
        }
        /*.equalIgnoreCase() checks the contant and 
        ignore the case sensitivity */


        //STRING INPUTE----------------------------------------------------

        //1. USING NEXT()
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Write an one line");
        // String str = sc.next();
        // System.out.println("You Write: " + str);
        /*When you use only next() it takes only one word from starting */

        //2. USING NEXLINE()
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Write an one line");
        // String str1 = sc1.nextLine();
        // System.out.println("You Write: " + str1);
        /*When you use only nextLine() it takes full sting you Entered*/
        
        

        String para = "My Name is Amar";

        //METHODS OF STRING

        //1> .substring(beginIndex, endIndex): devide string into parts
        //beginIndex ---> Inclusive
        //endIndex ---> Exclusive
        System.out.println(para.substring(2,7));

        //2> .contains(): check that perticula word is present or not
        System.out.println(para.contains("kushwaha"));

        //3> .valueOf(): change any data type into a String
        int num = 7345;
        String change  = String.valueOf(num);
        System.out.println(num + 1); //7345 + 1 = 7346 (addition) 
        System.out.println(change + 1); //7345 + 1 = 73451 (concatination)

        //4> .startsWith(String prefix) and .endsWith(String suffix): it checks the string is start or end with that pericular Prefix or Suffix that we enter
        System.out.println(para.startsWith("My"));
        System.out.println(para.endsWith("kushwaha"));



    }
}
