public class FindSubsets {

    public static void findSubsets(String str, int i, String ans){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Empty subset");
            }else{
                System.out.println(ans);
            }
            return;
    }

    //recursive case
    findSubsets(str, i+1, ans + str.charAt(i)); //include or yes call
    findSubsets(str, i+1, ans); //exclude or no call
    }

  

    public static void main(String[] args) {
        String str = "abc";
        // using string method
        findSubsets(str, 0, "");
    }
    
}
