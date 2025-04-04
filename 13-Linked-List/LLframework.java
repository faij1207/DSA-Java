//import LL collection framework
import java.util.LinkedList;

public class LLframework {
    
    public static void main(String[] args) {
        
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the list
        list.add(10); // add at end
        list.addFirst(5); // add at beginning
        list.addLast(15); // add at end (same as add())

        // Print the list
        System.out.println("LinkedList: " + list); // Output: [5, 10, 15]

        // Get elements
        System.out.println("First Element: " + list.getFirst()); // 5
        System.out.println("Last Element: " + list.getLast());   // 15
        System.out.println("Element at index 1: " + list.get(1)); // 10

        // Remove elements
        list.removeFirst(); // removes 5
        list.removeLast();  // removes 15
        list.remove(0);     // removes element at index 0

        System.out.println("After removals: " + list); // Output: []

        // Add more elements
        list.add(100);
        list.add(200);

        // Check for an element
        System.out.println("Contains 200? " + list.contains(200)); // true

        // List size
        System.out.println("Size of list: " + list.size()); // 2

        // Iterate over the list
        System.out.print("List elements: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
