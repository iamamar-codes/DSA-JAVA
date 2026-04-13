import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        //Decalarion
        int arr1[];
        //allocation
        arr1 = new int[5];

        //init
        int brr[] = {10, 20, 30};

        System.out.println("Value at 0 index " + brr[0]);
        System.out.println("Value at 1 index " + brr[1]);
        System.out.println("Value at 2 index " + brr[2]);

        System.out.println("Print Array Elements using For loop ");
        int n1 = 3;
        for(int index = 0; index <= n1-1; index++){
            System.out.println(brr[index]);
        }

        System.out.println("Print Array Elements using For Each loop ");
        for(int val : brr){
            System.out.println(val);
        }

        //taking input from user

        int arr[] = new int[5]; //size of array
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i=0; i< n-1; i++){
            System.out.println("Providde inpute for index " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements: ");
        for(int val : arr){
            System.out.print(" " + val);
        }

        //1. Practice quetion : sum array list

        int add[] = {10,20,55,30};
        int sum = 0;
        for(int i=0; i <= add.length-1; i++){
            sum = sum + add[i];
        }
        System.out.println("Sum of Array : " + sum);

        //2. Practice Quetion : Multiply of array List

        int mult[] = {2, 3, 4, 5};
        int ans = 1;
        int n = mult.length;
        for(int i=0; i<=n-1; i++){
            int value = mult[i];
            ans = ans * value;
        }
        System.out.println("Multiply of Array: " + ans);


        //3. practice quetion: find maximum value inside array
        
        int max[] = {45,23,11,-87,2};
        int maxValue = max[0];

        for(int i=0; i<=max.length-1; i++){    //using for-loop for comapring elements in array
            if(max[i] > maxValue){
                maxValue = max[i];
            }
        }
        System.out.println("Printing Maximum Value in Array : "+ maxValue);

    }
    
}
