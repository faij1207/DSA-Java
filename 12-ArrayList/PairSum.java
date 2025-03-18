import java.util.ArrayList;

public class PairSum {

    //brute force approach
    //Time complexity: O(n^2)
    // public static boolean sum1(ArrayList<Integer> numbers, int target) {
    //     for (int i = 0; i < numbers.size(); i++) {
    //         for (int j = i + 1; j < numbers.size(); j++) {
    //             if (numbers.get(i) + numbers.get(j) == target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //Optimized approach(two pointer approach)
    //Time complexity: O(n)
    public static boolean sum1(ArrayList<Integer> numbers, int target) {
        int left = 0;
        int right = numbers.size() - 1;
        while (left < right) {
            if (numbers.get(left) + numbers.get(right) == target) {
                return true;
            } else if (numbers.get(left) + numbers.get(right) < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int target = 9;
        System.out.println(sum1(numbers, target));
    }
    
}
