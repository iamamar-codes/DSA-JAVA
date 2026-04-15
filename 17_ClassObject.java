class ClassObject {
    // definrd Attributes
    String name;
    int id;
    int age;

    // Parameterized Constructor
    public ClassObject(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void Study(){
        System.out.println("Students are Studying");
    }
    public void Bunking(){
        System.out.println("All Students are bunk class today");
    }

    public static void main(String[] args) {
        ClassObject A  = new ClassObject("Amar Kushwaha", 101, 17);
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);

        A.Study();
        A.Bunking();
    }
}
