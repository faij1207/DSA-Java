// given an array of integers, find the inversions count in the array

// Inversion Count for an array indicates – how far (or close) the array is from being sorted.
// If the array is already sorted, then the inversion count is 0, but if the array is sorted in the reverse order,
// the inversion count is the maximum. Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

//sample input: N = 5, arr[] = {2, 4, 1, 3, 5}
//output: 3 , because (2,1), (4,1), (4,3) are the inversions

//sample input: N = 5, arr[] = {2,3,4,5,6}
//output: 0 , because the array is already sorted

//sample input: N = 3, arr[] = {5,5,5}
//output: 0 , because the array is already sorted

public class InversionCount {

    // Brute Force Approach
    // Time Complexity: O(n^2) - Two nested loops iterate over the array.
    // Space Complexity: O(1) - No extra space is used.

    public static int inversionCount(int[] arr) {
        int count = 0;
        
        // Iterate through each pair of elements in the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Count inversion if arr[i] > arr[j]
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Optimized Approach using Merge Sort (Divide and Conquer)
    // Time Complexity: O(n log n) - Due to recursive splitting and merging.
    // Space Complexity: O(n) - Extra space is used for temporary arrays.

    // Function to merge two sorted subarrays and count inversions
    public static int merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid, k = 0; // Pointers for left, right, and temp arrays
        int invCount = 0;
        int[] temp = new int[right - left + 1]; // Temporary array to store merged values

        // Merge elements while counting inversions
        while (i < mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
                invCount += (mid - i); // Count the number of inversions
            }
            k++;
        }

        // Copy remaining elements from the left subarray (if any)
        while (i < mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subarray (if any)
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to the original array
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    // Recursive Merge Sort function that also counts inversions
    public static int mergeSort(int[] arr, int left, int right) {
        int invCount = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort and count inversions in left and right halves
            invCount += mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);

            // Merge the two halves and count split inversions
            invCount += merge(arr, left, mid + 1, right);
        }
        return invCount;
    }

    // Function to get the inversion count using the optimized merge sort approach
    public static int optimizedInversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        // Brute force approach
        System.out.println("Inversions (Brute Force): " + inversionCount(arr));

        // Optimized merge sort approach
        System.out.println("Inversions (Optimized Merge Sort): " + optimizedInversionCount(arr));
    }
}
