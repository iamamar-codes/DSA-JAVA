class primNumbers {
    public static void main(String[] args) {
        int count = 0;

        for(int n= 0; n<=100; n++){
            count = 0;
            for(int i=1; i<=n; i++){
                if(n % i == 0){
                    count ++;
                }
            }

            if(count == 2){
                System.out.println("Prime Number from 1 to 100: "+ n);
            }
        }
        
    }
}
