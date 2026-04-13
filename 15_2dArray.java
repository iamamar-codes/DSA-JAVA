class twoDArray {
    public static void main(String[] args) {
        // decalartion
        int arr[][];

        // allocation
        arr = new int[3][4];

        // init
        int brr[][] = {
                { 1, 2 },
                { 2, 3, 7},
                { 3, 4, 6, 3, 5 },
                { 4, 5 }
        };
        // System.out.println(brr[2][1]);

        int rowLength = brr.length;
        // int colLength = brr[0].length; //this use for normal 2d array means same
        // number of column

        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {

            int colLength = brr[rowIndex].length;
            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println(" ");
        }
    }
}
