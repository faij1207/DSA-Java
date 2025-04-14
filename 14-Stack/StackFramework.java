//Description: This is a simple stack framework implementation in Java. 

import java.util.Stack;

public class StackFramework {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>(); // Create a stack of integers

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element of the stack
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack and print them
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
