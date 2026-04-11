class MaxFunction {
    static int GetMaximum(int a, int b) {
        if (a > b) {
            return a;
        } 
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        int MaximumNumber = GetMaximum(12,19);
        System.out.println("Max Number is : " + MaximumNumber);
    }
}
