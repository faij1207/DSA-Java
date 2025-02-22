# 08-OOPS

## Description

**Object-Oriented Programming System (OOPS)** is a programming paradigm based on the concept of "objects." These objects can hold data in fields (attributes) and code in methods (functions). OOPS makes it easier to manage and organize large codebases, making code more reusable, modular, and secure.

OOPS focuses on real-world entities such as inheritance, hiding, polymorphism, and more. It improves software design and development by modeling classes and objects.

---

### Key Concepts and Properties of OOPS

#### 1. **Class & Object**

- **Class**: A blueprint for creating objects. It defines attributes and methods.
- **Object**: An instance of a class containing specific values.

**Example:**

```java
class Car {
    String brand;
    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // Object creation
        car.brand = "Toyota";
        car.display();
    }
}
```

#### 2. **Access Modifiers**

Control the visibility of classes, methods, and variables.

- `public`: Accessible from anywhere.
- `private`: Accessible only within the class.
- `protected`: Accessible within the same package or subclasses.
- Default: Accessible within the same package.

**Example:**

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

#### 3. **Getter and Setter**

Used to access and update private variables safely.

**Example:**

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

---

### Four Pillars of OOPS

#### 1. **Encapsulation** *(Encapsulation.java)*

- Encapsulation binds data and methods into a single unit.
- Restricts direct access to certain components.

**Example:**

```java
public class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}
```

#### **Constructor** *(Constructor.java)*

- Special method called when an object is instantiated.
- Types:
  - **Default Constructor**: No arguments.
  - **Parameterized Constructor**: Takes parameters.
  - **Copy Constructor**: Creates a copy of another object.

**Example:**

```java
public class Student {
    String name;
    int age;

    // Default Constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }
}
```

#### **Destructor** *(Destructor.java)*

- Java doesn’t have destructors but uses Garbage Collection.
- The `finalize()` method can be used for cleanup.

**Example:**

```java
public class Resource {
    protected void finalize() throws Throwable {
        System.out.println("Object is being deleted");
    }
}
```

#### 2. **Inheritance**

- Allows a class to inherit properties from another class.

**Types:**

- *Single Inheritance* *(SingleInheritance.java)*: A class inherits from one superclass.
- *Multilevel Inheritance* *(MultilevelInheritance.java)*: A class inherits from a superclass, which in turn inherits from another superclass.
- *Hierarchical Inheritance* *(Hierarchical.java)*: Multiple classes inherit from a single superclass.
- *Hybrid Inheritance* *(Hybrid.java)*: A combination of two or more types of inheritance. Note: Java does not support hybrid inheritance directly but can be achieved using interfaces.
- *Multiple Inheritance* *(MultipleInheritance.java)*: A class inherits from more than one superclass. Note: Java supports multiple inheritance through interfaces.

#### 3. **Polymorphism** *(Polymorphism.java)*

- Allows objects to take many forms.
- Types:
  - **Compile-time Polymorphism (Overloading):** Multiple methods with the same name.
  - **Runtime Polymorphism (Overriding):** Subclass provides specific implementation.

**Example:**

```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
```

#### 4. **Abstraction** *(Abstraction.java)*

- Hides implementation details and shows essential features.

**Example:**

```java
abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
```

---

#### **Interfaces** *(Interface.java)*

- Defines a contract that a class must implement.

**Example:**

```java
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
}
```

#### **Static Keyword**

- Belongs to the class instead of an instance.

**Example:**

```java
class Example {
    static int count = 0;
    static void displayCount() {
        System.out.println("Count: " + count);
    }
}
```

#### *Super Keyword**

- Refers to the immediate parent class.

**Example:**

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
```

## How to Run the Programs

1. **Compile the program**:

    ```bash
    javac filename.java
    ```

2. **Run the program**:

    ```bash
    java filename
    ```
