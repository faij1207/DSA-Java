// Created by: [Faij Alam]
// Description: Stack implementation using ArrayList in Java

import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
        private static ArrayList<Integer> stackList = new ArrayList<>(); // ArrayList to store stack elements

        // check if stack is empty
        public boolean isEmpty() {
            return stackList.size() == 0;
        }

        // push element onto stack
        public void push(int value) {
            stackList.add(value); // add element to the end of the list
        }

        // pop element from stack
        public static int pop() {
            int top = stackList.get(stackList.size() - 1); // get the last element
            stackList.remove(stackList.size() - 1); // remove the last element
            return top; // return the popped element
        }

        // peek at the top element of the stack
        public static int peek() {
            return stackList.get(stackList.size() - 1); // return the last element without removing it
        }
    } 

    public static void main(String[] args) {
        Stack stack = new Stack(); // create a new stack

        // push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty()) {
           System.out.println(stack.peek()); // pop and print elements until stack is empty 
              stack.pop(); // remove the top element
        }
    }
}
