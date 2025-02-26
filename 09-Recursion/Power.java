// find x^n using recursion

public class Power {
 
    //find x raised to the power n
    //time complexity: O(n)
    //space complexity: O(n)
    public static int power(int x, int n) {
        //base case
        if (n == 0) {
            return 1;
        }
        //recursive case
        return x * power(x, n - 1);
    }

    //optimized solution
    //time complexity: O(log n)
    public static int powerOptimized(int x, int n) {
        //base case
        if (n == 0) {
            return 1;
        }
        //recursive case
        int temp = powerOptimized(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(x + " raised to the power " + n + " is: " + power(x, n));
        System.out.println(x + " raised to the power " + n + " is: " + powerOptimized(x, n));
    }
    
}
