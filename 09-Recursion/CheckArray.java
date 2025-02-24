//check if an array is sorted or not using recursion

public class CheckArray {
    
    public static boolean isSorted(int[] arr, int n){
        // Base condition
        if(n==arr.length-1){
            return true;
        }

        if(arr[n] > arr[n+1]){
            return false;
        }

        return isSorted(arr, n+1); // Recursive call
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        System.out.println("Is array sorted: " + isSorted(arr, 0));
    }
}

// Output: Is array sorted: true
