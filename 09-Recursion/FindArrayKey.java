public class FindArrayKey {
    
    //find the first occurrence of key in the array
    public static int firstOccurrence(int[] arr, int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return firstOccurrence(arr, key, index + 1);
    }

    //find the last occurrence of key in the array
    public static int lastOccurrence(int[] arr, int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        int result = lastOccurrence(arr, key, index + 1);
        
        if (result == -1 && arr[index] == key) {
            return index;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6, 7, 8, 9};
        int key = 3;
        System.out.println("First Occurrence of " + key + " is at index: " + firstOccurrence(arr, key, 0));
        System.out.println("Last Occurrence of " + key + " is at index: " + lastOccurrence(arr, key, 0));
    }
}


// Output
// First Occurrence of 3 is at index: 2
// Last Occurrence of 3 is at index: 5
// Time Complexity: O(n)
// Space Complexity: O(n)
