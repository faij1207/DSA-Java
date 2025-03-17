// Find the maximum and minimum element in an arraylist
// You can use the following code snippet to find the maximum and minimum element in an ArrayList:

import java.util.ArrayList;

public class FindMaxMin {

    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(2);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find the maximum and minimum element in the list

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            // this is for getting the maximum element
            if (num > max) {
                max = num;
            }
            // this is for getting the minimum element
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }        
}
