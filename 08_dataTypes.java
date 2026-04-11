class DataTypes{
    public static void main(String[] args) {
        //Primitive DT:

        // 1) Numeric type---------------------------------------------------------
        byte num1 = 127;     //Size- 1 byte (8 bits)
        System.out.println("byte: "+num1);

        short num2 = 32767; //Size- 2 bytes (16 bits)
        System.out.println("short: "+num2);

        int num3 = 1234567890; //Size- 3 bytes (32 bits)
        System.out.println("int: "+num3);

        long num4 = 9223372036854775807l; //Size- 8 bytes (65 bits)
        System.out.println("long: "+ num4);

        // 2)floating DT-----------------------------------------------------------
        float num5 = 3.14f;  //Size- 4 bytes (32 bits)
        System.out.println("Float: "+num5);

        double num6 = 3.1424354686; //Size- 8 bytes (64 bits)
        System.out.println("double: "+num6);

        // 3)other DT- Char, boolean------------------------------------------------

        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("Character: "+ firstCharacter);
        System.out.println((char)(firstCharacter+2)); //Emplicit Data type conversion


        //Implicit Conversion: converting Small data type to the Big data type
        int no1 = 1234567890;
        long newNo1 = no1;
        System.out.println("small to big conversion: "+ newNo1);


        //EXplicit Conversion: converting Big data type to the Small data type

        long no2 = 922337203;   //Data can be lost
        int newNo2 = (int)no2;
        System.out.println("Big to Small conversion: "+ newNo2);



    }
}