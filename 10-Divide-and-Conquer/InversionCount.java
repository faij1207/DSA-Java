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

    //brute force approach
    //time complexity: O(n^2)

    public static int inversionCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        //brute force approach
        System.out.println(inversionCount(arr));
    }
    
}
