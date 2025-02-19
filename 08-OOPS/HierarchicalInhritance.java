//Hierarchical Inheritance
//In hierarchical inheritance, one class serves as a superclass (base class) for more than one subclass.
//In the below example, the Animal class is a superclass for Dog and Cat classes.

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
class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing");
    }
}

public class HierarchicalInhritance {
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Bruno"; // Inherited property
        d.eat();  // Inherited method
        d.bark(); // Own method

        Cat c = new Cat();
        c.name = "Whiskers"; // Inherited property
        c.eat();  // Inherited method
        c.meow(); // Own method
    }
}
