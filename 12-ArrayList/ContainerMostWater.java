import java.util.ArrayList;

public class ContainerMostWater {

    //Brute force approach
    //Time complexity: O(n^2)
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     for(int i = 0; i < height.size(); i++){
    //         for(int j = i + 1; j < height.size(); j++){
    //             int ht= Math.min(height.get(i), height.get(j));
    //             int wd = j - i;
    //             int water = ht * wd;
    //             maxWater = Math.max(maxWater, water);
    //         }
    //     }
    //     return maxWater;  
    // }

    
    //Optimized approach (Two pointer approach)
    //Time complexity: O(n)

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = height.size() - 1;
        while(leftPointer < rightPointer){

            //calculate the water stored between the two containers
            int ht = Math.min(height.get(leftPointer), height.get(rightPointer));
            int wd = rightPointer - leftPointer;
            int water = ht * wd;
            maxWater = Math.max(maxWater, water);

            //update the pointers
            //if the height of the left container is less than the height of the right container, move the left pointer to the right
            if(height.get(leftPointer) < height.get(rightPointer)){
                leftPointer++;
            }else{
                rightPointer--;
            }
        }
        return maxWater;
    }
    
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> height = new ArrayList<>();

        // Add elements to the ArrayList
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Height of the containers: " + height);
        System.out.println("Maximum water that can be stored: " + storeWater(height));
        
    }
}
