import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(2);

        System.out.println("Original list: " + list);

        // Sort the list in ascending order
        Collections.sort(list);
        System.out.println("Sorted list in ascending order: " + list);

        // Sort the list in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list in descending order: " + list);

    }
    
}
