
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

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        System.out.println(totelWays(0, 0, m, n));
    }    
}

// Time Complexity: O(2^(m+n))
// Space Complexity: O(m+n) -> stack space

//output: 20
