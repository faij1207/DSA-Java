
class Student {
    String name;
    int age;

    // 1️⃣ Default Constructor (No Arguments) , non-parameterized constructor
    Student() {
        System.out.println("Default Constructor Called!");
        name = "Unknown";
        age = 0;
    }

    // 2️⃣ Parameterized Constructor
    Student(String name, int age) {
        System.out.println("Parameterized Constructor Called!");
        this.name = name;
        this.age = age;
    }

    // 3️⃣ Copy Constructor
    Student(Student s) {
        System.out.println("Copy Constructor Called!");
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Calling Default Constructor
        Student s1 = new Student();
        s1.display();
        
        // Calling Parameterized Constructor
        Student s2 = new Student("Faij", 22);
        s2.display();

        // Calling Copy Constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}

// Output:
// Default Constructor Called!
// Name: Unknown, Age: 0
// Parameterized Constructor Called!
// Name: Faij, Age: 22
// Copy Constructor Called!
// Name: Faij, Age: 22

