class Array {
    public static void main(String[] args) {
        //Decalarion
        int arr[];
        //allocation
        arr = new int[5];

        //init
        int brr[] = {10, 20, 30};

        System.out.println("Value at 0 index " + brr[0]);
        System.out.println("Value at 1 index " + brr[1]);
        System.out.println("Value at 2 index " + brr[2]);

        System.out.println("Print Array Elements using For loop ");
        int n = 3;
        for(int index = 0; index <= n-1; index++){
            System.out.println(brr[index]);
        }

        System.out.println("Print Array Elements using For Each loop ");
        for(int val : brr){
            System.out.println(val);
        }
    }
    
}
