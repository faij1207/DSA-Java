//Question 1: Apply merge sort to sort the array of String . ( Assume that all the characters in
// the string are lowercase alphabets)

//sample input: arr={"sun", "moon", "star", "planet", "earth"}
//output: arr={"earth", "moon", "planet", "star", "sun"}

public class Question1 {
    
    // Function to perform merge sort on an array of strings
    public static String[] mergeSort(String[] array, int low, int high) {
        // Base case: If there is only one element, return it as a new array
        if (low == high) {
            return new String[]{array[low]};
        }

        // Find the middle index of the array
        int middle = low + (high - low) / 2;

        // Recursively sort the left and right halves of the array
        String[] leftSortedArray = mergeSort(array, low, middle);
        String[] rightSortedArray = mergeSort(array, middle + 1, high);

        // Merge the sorted halves into a single sorted array
        return merge(leftSortedArray, rightSortedArray);
    }

    // Function to merge two sorted string arrays
    public static String[] merge(String[] leftArray, String[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        // New array to store the merged result
        String[] mergedArray = new String[leftSize + rightSize];

        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

        // Compare elements from both arrays and place them in sorted order
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (isAlphabetical(leftArray[leftIndex], rightArray[rightIndex])) {
                mergedArray[mergedIndex++] = leftArray[leftIndex++];
            } else {
                mergedArray[mergedIndex++] = rightArray[rightIndex++];
            }
        }

        // Copy any remaining elements from the left array
        while (leftIndex < leftSize) {
            mergedArray[mergedIndex++] = leftArray[leftIndex++];
        }

        // Copy any remaining elements from the right array
        while (rightIndex < rightSize) {
            mergedArray[mergedIndex++] = rightArray[rightIndex++];
        }

        return mergedArray;  // Return the merged sorted array
    }

    // Function to check if one string should come before another in alphabetical order
    public static boolean isAlphabetical(String firstString, String secondString) {
        return firstString.compareTo(secondString) < 0;  // Returns true if firstString is alphabetically smaller
    }

    public static void main(String[] args) {
        // Define an array of strings to be sorted
        String[] wordsArray = {"sun", "moon", "star", "planet", "earth"};

        // Call mergeSort to sort the array
        String[] sortedWordsArray = mergeSort(wordsArray, 0, wordsArray.length - 1);

        // Print the sorted array
        for (String word : sortedWordsArray) {
            System.out.print(word + " ");
        }
    }
}
// Time Complexity: O(n log n) where n is the number of strings in the array.
// Space Complexity: O(n) where n is the number of strings in the array.
