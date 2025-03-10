//given an array nums of size n, return the majority element.
//the majority element is the element that appears more than n/2 times. you may assume that the majority element always exists in the array.

//example 1:
//input: nums = [3,2,3]
//output: 3

//example 2:
//input: nums = [2,2,1,1,1,2,2]
//output: 2

//constraints:
//n == nums.length
//1 <= n <= 5 * 10^4
//-10^9 <= nums[i] <= 10^9

public class Question2 {
    
    //Approch 1: Brute force
    //time complexity: O(n^2)
    //space complexity: O(1)
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > majorityCount){
                return nums[i];
            }
        }
        return -1;
    }

    //Approch 2: divide and conquer
    //time complexity: O(nlogn)
    //space complexity: O(logn)

    public static int countInRange(int[] nums, int num, int lo, int hi){
        int count = 0;
        for(int i=lo; i<=hi; i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }

    public static int majorityElementRec(int[] nums, int lo, int hi){
        //base case: the only element in an array of size 1 is the majority element
        if(lo == hi){
            return nums[lo];
        }

        //recurse on left and right halves of this slice
        int mid = lo + (hi - lo) / 2;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        //if the two halves agree on the majority element, return it
        if(left == right){
            return left;
        }

        //otherwise, count each element and return the "winner"
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;

    }

    public static int majorityElementDivideAndConquer(int[] nums){
        return majorityElementRec(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
        // Define an array of integers to find the majority element
        int[] nums = {2,2,1,1,1,2,2};

        // Find the majority element in the array using the brute force approach
        System.out.println("Majority element (Brute Force): " + majorityElement(nums));

        // Find the majority element in the array using the divide and conquer approach
        System.out.println("Majority element (Divide and Conquer): " + majorityElementDivideAndConquer(nums));
    }
}
