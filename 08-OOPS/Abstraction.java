public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Calls abstract method implementation
        d.eat();    // Calls concrete method

        Cat c = new Cat();
        c.sound(); // Calls abstract method implementation
        c.eat(); // Calls concrete method
    }
    
}

// abstract class
abstract class Animal {
    abstract void sound();  // Abstract method (No body)
    
    void eat() {  // Concrete method (Has body)
        System.out.println("Eating...");
    }
}

// Concrete class
class Dog extends
Animal {
    void sound() {
        System.out.println("Barking...");
    }
}

class Cat extends
Animal {
    void sound() {
        System.out.println("Meowing...");
    }
}


// Output
// Barking...
// Eating...
// Meowing...
// Eating...