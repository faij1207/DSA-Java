//For a given integer array of size N, You have to find all occurrences
//(indices) of a given element (key) and print them. use recursion.
//sample input: [1, 2, 3, 4, 5, 6, 3, 7, 8, 3], key = 3
//output: 2, 6, 9

public class Question1 {
    public static void allOccurences(int[] arr, int key, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == key){
            System.out.print(index + " ");
        }
        allOccurences(arr, key, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 7, 8, 3};
        int key = 3;
        allOccurences(arr, key, 0);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)
// where N is the size of the array.
//output: 2 6 9