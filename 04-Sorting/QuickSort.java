public class QuickSort {
    
     //print array
     public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si , int ei){
        if(si>=ei){
            return;
        }
        //last element as pivot
        int pi = partition(arr, si, ei);

        quickSort(arr, si, pi-1);
        quickSort(arr, pi+1, ei);
    }

    //partition
    public static int partition(int arr[], int si , int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for element smaller than pivot

        //compare and swap
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //swap pivot with element at i+1
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 6,3,9,8,2,-5,-3};
        quickSort(arr,0, arr.length-1);
        printArr(arr);
    }
}
