
public class GridWays {

    public static int totelWays(int i, int j, int m , int n){
        //base case
        if(i == m-1 && j == n-1){ //if we reach the destination
            return 1;
        } else if(i==n || j==m){ //if we go out of the grid
            return 0;
        }

        //recursive case
        int w1 = totelWays(i+1, j, m, n);
        int w2 = totelWays(i, j+1, m, n);
        return w1 + w2;
    }

    //optimized method (mathe trick for linear time complexity)
    public static int optimizedWays(int m, int n) {
        // Using permutation formula: (m+n-2)! / ((m-1)! * (n-1)!)
        return factorial(m + n - 2) / (factorial(m - 1) * factorial(n - 1));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        //total ways to reach from (0,0) to (m-1, n-1) using recursion
        System.out.println(totelWays(0, 0, m, n));

        //optimized method using math trick
        System.out.println(optimizedWays(m, n));
    }    
}

// Time Complexity: O(2^(m+n))
// Space Complexity: O(m+n) -> stack space

//output: 20
