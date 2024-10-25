public class InsertionSort {

    // Method to sort an array using insertion sort algorithm
    public static void sort(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++){
            int curr = arr[i];
            int prev = i - 1;

            // Shift elements of arr[0..i-1], that are greater than curr, to one position ahead of their current position
            while (prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }

            // Place the current element at its correct position
            arr[prev + 1] = curr;
        }
    }
    
    // Method to print the elements of the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {5, 3, 2, 4, 1};
        sort(arr);
        printArr(arr);
    }  
}