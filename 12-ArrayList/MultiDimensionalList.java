import java.util.ArrayList;

public class MultiDimensionalList {

    public static void main(String[] args) {
        
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Create a row
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        // Add the row to the main list
        mainList.add(row1);

        // Create another row
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        // Add the row to the main list
        mainList.add(row2);

        // Print the 2D ArrayList
        System.out.println(mainList);

        //nested for loop to print the elements of the 2D ArrayList
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }           
    }
    
}

// In this example, we created a 2D ArrayList named mainList. We then created two rows (ArrayLists) named row1 and row2, and added them to the mainList. Finally, we printed the 2D ArrayList and used a nested for loop to print the elements of the 2D ArrayList. The output of the program is as follows:
//time complexity: O(n^2) where n is the number of elements in the 2D ArrayList.
//space complexity: O(n) where n is the number of elements in the 2D ArrayList.


//output
// [[1, 2, 3], [4, 5, 6]]
// 1 2 3
// 4 5 6