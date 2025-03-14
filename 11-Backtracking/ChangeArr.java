public class ChangeArr {
    
    public static void changeArr(int[] arr, int index, int value) {
        //base case
        if(index == arr.length) {
            printArr(arr);
            return;
        }

        //recursive case
        arr[index] = value;
        changeArr(arr, index + 1, value+1); //fnx call step
        arr[index] = arr[index] -2; //backtracking step
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
