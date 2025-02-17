class Demo {
    // Constructor
    Demo() {
        System.out.println("Object Created");
    }

    // Destructor (Garbage Collector)
    @Override
    protected void finalize() {
        System.out.println("Object Destroyed");
    }
}

public class Destructor {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1 = null; // Make object eligible for garbage collection
        System.gc(); // Request garbage collection
    }
}
