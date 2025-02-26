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

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(x + " raised to the power " + n + " is: " + power(x, n));
    }
    
}
