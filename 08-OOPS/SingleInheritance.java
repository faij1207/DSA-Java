//single level inheritance
//Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.

//Parent class / base class / super class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

//Child class / derived class / sub class

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Bruno"; // Inherited property
        d.eat();  // Inherited method
        d.bark(); // Own method
    }
}

// output

// Bruno is eating
// Bruno is barking
