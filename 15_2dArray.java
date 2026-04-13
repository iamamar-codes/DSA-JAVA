class twoDArray {
    public static void main(String[] args) {
        // decalartion
        int arr[][];

        // acllocation
        arr = new int[3][4];

        // init
        int brr[][] = {
                { 1, 2 },
                { 2, 3 },
                { 3, 4 }
        };
        //System.out.println(brr[2][1]);

        int rowLength = brr.length;
        int colLength = brr[0].length;

        for(int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
            for(int colIndex = 0; colIndex <= colLength-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println(" ");
        }
    }
}
