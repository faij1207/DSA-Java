public class Encapsulation {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee emp = new Employee();

        // Set the value of the variable
        emp.setName("John");

        // Get the value of the variable
        System.out.println(emp.getName());
    }

    // Create a class named Employee
    static class Employee {
        // Create a private variable
        private String name;

        // Create a public method to get the value of the variable
        public String getName() {
            return name;
        }

        // Create a public method to set the value of the variable
        public void setName(String name) {
            this.name = name;
        }
    }
}