//1. Compile-time polymorphism- Method overloading

// Method overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.

class Calculator {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

//2. Run-time polymorphism- Method overriding

// Method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already provided by its superclass.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }
}

public class Polymorphism {
    
    public static void main(String[] args) {
        Calculator m = new Calculator();
        System.out.println(m.add(2, 3)); // 5
        System.out.println(m.add(2, 3, 4)); // 9


        Dog d = new Dog();
        d.eat(); // Dog is eating
    }
}
