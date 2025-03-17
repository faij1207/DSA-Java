import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();

        // 1️⃣ Add elements to the ArrayList (O(1) per operation)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // 2️⃣ Print all elements in the list (O(N))
        System.out.println("Original List: " + list);

        // 3️⃣ Get an element at a specific index (O(1))
        System.out.println("Element at index 2: " + list.get(2));

        // 4️⃣ Remove an element at a specific index (O(N) in worst case)
        list.remove(3); // Removes element at index 3 (40)
        System.out.println("After removing index 3: " + list);

        // 5️⃣ Set (update) an element at a specific index (O(1))
        list.set(1, 25);
        System.out.println("After setting index 1 to 25: " + list);

        // 6️⃣ Check if the list contains an element (O(N))
        System.out.println("List contains 30? " + list.contains(30));

        // 7️⃣ Get the size of the list (O(1))
        System.out.println("Size of list: " + list.size());

        // 8️⃣ print reverse of the list (O(N))
        System.out.println("Reverse of the list: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
