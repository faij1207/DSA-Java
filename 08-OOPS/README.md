# 08-OOPS

## Description

**Object-Oriented Programming System (OOPS)** is a programming paradigm based on the concept of "objects" that contain data (fields) and methods (functions). OOPS helps in organizing code, making it reusable, and improving security.

### Key Properties of OOPS

1. **Class & Object**
   - A class is a blueprint for creating objects.
   - An object is an instance of a class.

   ```java
   class Car {
       String brand;
       void display() {
           System.out.println("Brand: " + brand);
       }
   }

   public class Main {
       public static void main(String[] args) {
           Car car = new Car();
           car.brand = "Toyota";
           car.display();
       }
   }
   ```

2. **Access Modifiers**
   - Control access to classes, methods, and variables.
   - Types: `public`, `private`, `protected`, and default.

   ```java
   public class Example {
       private int number;
       public void setNumber(int num) {
           this.number = num;
       }
       public int getNumber() {
           return number;
       }
   }
   ```

3. **Getter and Setter**
   - Used to access and update private variables.

   ```java
   public class Person {
       private String name;
       public String getName() {
           return name;
       }
       public void setName(String name) {
           this.name = name;
       }
   }
   ```

### Four Pillars of OOPS

1. **Encapsulation** *(Encapsulation.java)*
   - Binding data and methods into a single unit.
   - Provides security by restricting direct access.

2. **Constructor** *(Constructor.java)*
   - Initializes objects when they are created.
   - Types: Default, Parameterized, Copy.

3. **Destructor** *(Destructor.java)*
   - Java handles destruction automatically through garbage collection.
   - Demonstrates object cleanup.

4. **Inheritance**
   - Allows a class to inherit properties from another class.

   - *SingleInheritance.java*: One class inherits from another.
   - *MultilevelInheritance.java*: Inheritance across multiple levels.
   - *Hierarchical.java*: Multiple classes inherit from one base class.
   - *Hybrid.java*: Combination of two or more types of inheritance.
   - *MultipleInheritance.java*: Achieved using interfaces in Java.

5. **Polymorphism** *(Polymorphism.java)*
   - Allows objects to take many forms.
   - Types:
     - Compile-time (Method Overloading)
     - Run-time (Method Overriding)

6. **Abstraction** *(Abstraction.java)*
   - Hides unnecessary details and shows only essential features.
   - Achieved using abstract classes and interfaces.

7. **Interfaces** *(Interface.java)*
   - Specifies methods a class must implement.

8. **Static Keyword**
   - Belongs to the class rather than an instance.

   ```java
   class Example {
       static int count = 0;
       static void displayCount() {
           System.out.println("Count: " + count);
       }
   }
   ```

9. **Super Keyword**
   - Refers to the immediate parent class.

   ```java
   class Parent {
       void display() {
           System.out.println("Parent Method");
       }
   }
   class Child extends Parent {
       void display() {
           super.display();
           System.out.println("Child Method");
       }
   }

## How to Run the Programs

1. **Compile the program**:

    ```bash
    javac filename.java
    ```

2. **Run the program**:

    ```bash
    java filename
    ```
