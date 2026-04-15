class ClassObject {
    // definrd Attributes
    String name;
    int id;
    int age;

    // Default Constructor
    public ClassObject() {
        System.out.println("This is Default Constructor");
    }

    // Parameterized Constructor
    public ClassObject(String name, int id, int age) {
        System.out.println("This is Parameterized Constructor");
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // METHODS OR BEHAVIOURS
    public void Study() {
        System.out.println("Students are Studying");
    }

    public void Bunking() {
        System.out.println("All Students are bunk class today");
    }

    public static void main(String[] args) {
        ClassObject d = new ClassObject();
        d.age = 18;
        d.id = 101;
        d.name = "Amit";
        System.out.println(d.age);
        System.out.println(d.id);
        System.out.println(d.name);
        System.out.println();

        ClassObject A = new ClassObject("Amar Kushwaha", 101, 17);
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);

        System.out.println();
        
        A.Study();
        A.Bunking();
    }
}
