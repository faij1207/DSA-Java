// Multilevel Inheritance
// In multilevel inheritance, a class is derived from a class which is also derived from another class.


// Parent class / base class / super class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class / derived class / sub class
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Child class / derived class / sub class
class Puppy extends Dog {
    void weep() {
        System.out.println(name + " is weeping");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.name = "Tommy"; // Inherited property
        p.eat();  // Inherited method
        p.bark(); // Inherited method
        p.weep(); // Own method
    }  
}
