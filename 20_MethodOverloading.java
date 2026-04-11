class MethodOverloading {
    
    static String display(String name){
        System.out.println("Name: " + name);
        return name;
    }
    static int display(int rollno){
        System.out.println("Roll Number: " + rollno);
        return rollno;
    }

    public static void main(String[] args) {
        display("Amar Kushwaha");
        display(101);

    }
}
