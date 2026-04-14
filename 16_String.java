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
        /*.equalIgnoreCase() checks the contant and ignore the case sensitivity */


        //STRING INPUTE-----------------------------------------------------------------------------------

        

    }
}
