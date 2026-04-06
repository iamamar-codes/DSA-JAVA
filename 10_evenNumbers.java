class evenNumbers {
    public static void main(String[] args) {
        int i=2;
        while(i<=100){
            System.out.println("All Even numbers From 1 to 100: " + i);
            i += 2;
        }

        for(int no=1; no<=100; no++){
            if( no % 2 == 0){
                System.out.println("Number is Even: "+ no);
            }
        }
    }
}
