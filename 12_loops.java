class loops {
    public static void main(String[] args) {
        // Forloop
        for (int i = 1; i <= 5; i++) {
            // System.out.println("Value of i: "+i);
        }

        for (int i = 1; i <= 10; i++) {
            // System.out.println("Amar");
        }

        for (int i = 1; i <= 10; i += 2) {
            // System.out.println("Value of i: "+i);
        }

        for (int i = 1; i <= 3; i++) // Oute Loop
        {
            for (int j = 1; j <= 3; j++) // Inner Loop
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7 || i == 9) {
                continue;
            }
            System.out.println(i);
        }

    }
}
