public class RotatedArraySearch {
    
    //search in rotated array using method 1
    //time complexity: O(logn)
    public static int search(int arr[], int target, int si , int ei){

        //base case
        if(si>ei){
            return -1;
        }

        //work
        int mid = si+(ei-si)/2;

        //case found
        if(arr[mid]==target){
            return mid;
        }

        //case 1: mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left
            if(target>=arr[si] && target<=arr[mid]){
                return search(arr, target, si, mid-1);
            } else{
                //case b: right
                return search(arr, target, mid+1, ei);
            }
        }

        //case 2: mid on L2
        else{
            //case a: left
            if(target>=arr[mid] && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            } else{
                //case b: right
                return search(arr, target, si, mid-1);
            }
        }
    }

    //search in rotated array using method 2
    //time complexity: O(logn)
    public static int searchIterative(int arr[], int target) {
        int si = 0, ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // case 1: mid on L1
            if (arr[si] <= arr[mid]) {
                // case a: left
                if (target >= arr[si] && target <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    // case b: right
                    si = mid + 1;
                }
            }
            // case 2: mid on L2
            else {
                // case a: left
                if (target >= arr[mid] && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    // case b: right
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2};
        int target = 0;//output: 4
        System.out.println(search(arr, target, 0, arr.length-1));
        System.out.println(searchIterative(arr, target));
    }
}
