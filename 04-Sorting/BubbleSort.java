public class BubbleSort{
    public static void sort (int arr[]){
        boolean swapped;  // To check if a swap happened

        for(int turn=0; turn < arr.length-1; turn++){
            swapped = false;  // Set swapped to false at the beginning of each pass
            
            for (int j=0; j < arr.length-1-turn ; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;  // A swap happened
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArr( int arr[]) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={5,3,2,4,1};
        sort(arr);
        printArr(arr);
    }
}



