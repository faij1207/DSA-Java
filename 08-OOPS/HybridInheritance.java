//Hybrid Inheritance 
//In hybrid inheritance, a class is derived from two or more classes.

// Parent class / base class / super class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class / derived class / sub class
class Dog extends
        Animal {
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

// Child class / derived class / sub class
class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing");
    }
}

public class HybridInheritance {

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.name = "Tommy"; // Inherited property
        p.eat();  // Inherited method
        p.bark(); // Inherited method
        p.weep(); // Own method

        Cat c = new Cat();
        c.name = "Whiskers"; // Inherited property
        c.eat();  // Inherited method
        c.meow(); // Own method
    }
}
