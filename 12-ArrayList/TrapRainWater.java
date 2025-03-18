import java.util.ArrayList;

public class TrapRainWater {
    
    public static int trappedWater(ArrayList<Integer> height){
        int n=height.size();
        
        //Calculate left max boundary array
        int leftMax[]=new int[n];
        leftMax[0]=height.get(0);
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(height.get(i), leftMax[i-1]);
        }
        
        //calculate right max boundary array 
        int rightMax[]=new int[n];
        rightMax[n-1]=height.get(n-1);
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(height.get(i), rightMax[i+1]);
        }
        
        int totalWater=0;
        //loop
        for(int i=0; i<n; i++){
            //waterLevel=min(leftMax bound, rightMax bound)
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
                //trapped water=waterLevel-height
                totalWater+=waterLevel-height.get(i);
            }
            return totalWater;
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

        System.out.println(trappedWater(height));
 
    }
}
