public class FindPermutations {
    
    //time complexity: O(n!)
    //space complexity: O(n)

        public static void findPermutations(String str,String ans){
            //base case
            if(str.length() == 0){
                System.out.println(ans);
                return;
            }
            
            //recursive case
            for(int i = 0; i < str.length(); i++){
                char current = str.charAt(i);
                String remaining = str.substring(0,i) + str.substring(i+1);
                findPermutations(remaining, ans + current);
            }                
        } 

        public static void main(String[] args) {
            String str = "abc";
            findPermutations(str, "");
        }
}

//output
// abc
// acb
// bac
// bca
// cab
// cba

