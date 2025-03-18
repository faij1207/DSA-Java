import java.util.ArrayList;

public class PairSum2 {

    //two pointer approach
    //Time complexity: O(n)
    public static boolean pairSum(ArrayList<Integer> numbers, int target) {
        int bp=-1;
        int n=numbers.size();

        for(int i=0; i<numbers.size()-1; i++){
            if(numbers.get(i)>numbers.get(i+1)){ //find the breaking point
                bp=i;
                break;
            }
        }

        int left=bp+1; //smallest element
        int right=bp;  //largest element

        while(left!=right){

            //case 1: if the sum of the elements at the left and right pointers is equal to the target
            if(numbers.get(left)+numbers.get(right)==target){
                return true;
            }

            //case 2: if the sum of the elements at the left and right pointers is less than the target
            if(numbers.get(left)+numbers.get(right)<target){
                left=(left+1)%n;
            }else{
                //case 3: if the sum of the elements at the left and right pointers is greater than the target
                right=(n+right-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        // 11, 15, 6, 8, 9, 10 - sorted and rotated
        numbers.add(11);
        numbers.add(15);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int target=16;
        System.out.println(pairSum(numbers, target));

    }
}
