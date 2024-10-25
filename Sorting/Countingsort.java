import java.util.*;

public class Countingsort {
    
    // Function to perform counting sort on the array
    public static void sort(int arr[]){
        int n = arr.length;

        // Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array to store the count of each unique element
        int count[] = new int[largest + 1];
        for(int i = 0; i < n; i++){
           count[arr[i]]++;
        }

        // Reconstruct the sorted array using the count array
        int j = 0;
        for(int i = 0; i <= largest; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Function to print the elements of the array
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to test the counting sort
    public static void main(String args[]){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        sort(arr);
        printArr(arr);
    }
}
