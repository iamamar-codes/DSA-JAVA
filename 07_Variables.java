class Variables {
    public static void main(String[] args) {
        int main = 20;
        System.out.println(main); // main is not a reserve keyword

        int totalMarks = 0;
        int studentCount = 5;
        double averageMarks = totalMarks / (double) studentCount; //convert int to double

        boolean isPassed = averageMarks >= 40;

        System.out.println(isPassed);

    }
}

/*
 * #RULES FOR VARIABLE NAMING
 * 
 * 1. Case Sensitivity[age vs AGE]
 * 2. Use meaningful names [int studentCount = 10;]
 * 3. Starting Character[a, A,.....,$]
 * 4. NO Reserved Keywords[class, static etc]
 * 5. Follow naming conventions[camelCase for variables] 
 *          ->int totalMarks;
            ->String userName;
 */