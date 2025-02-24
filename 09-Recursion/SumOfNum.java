//print sum of n natural numbers using recursion
import java.util.*;

public class SumOfNum {

    // Function to find sum of n natural numbers
    public static int sum(int n){
        // Base condition
        if(n == 0){
            return 0;
        }
        return n + sum(n-1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find sum of n natural numbers: ");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " natural numbers is: " + sum(n));
        sc.close();
    }
    
}
