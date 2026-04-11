class divisibleByseven {
    public static void main(String[] args) {
        //Using for loop
        for(int i=50; i<=100; i++){
            if(i % 7 == 0){
                System.out.println("Number is perfectly divisible by 7 : "+ i);
            }
        }

        //Using while loop

        int j = 50;
        while(j<=100){
            if(j % 7 == 0){
                System.out.println("Number is divisible by 7 is " + j);
            }
            j++;
        }
    }
}
