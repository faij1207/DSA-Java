// print nth fibonacci number using recursion
import java.util.*;

public class FibonacciNum {

    // Function to find nth fibonacci number
    public static int fibonacci(int n){
        // Base condition
        if(n == 0 || n==1){
            return n;
        }
      
        return fibonacci(n-1) + fibonacci(n-2); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find nth fibonacci number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        sc.close();
    }
    
}

// Output:
// Enter the number to find nth fibonacci number:
// 10
// Fibonacci number at position 10 is: 55
