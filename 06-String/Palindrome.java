import java.util.*;

public  class Palindrome {

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println(str + "= not a palindrome");
                return false;
            }
        }
        System.out.println(str + "= is a Palindrome");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
    
        isPalindrome(str);
    }
}


//output

//racecar
// racecar= is a Palindrome

// game
// game= not a palindrome