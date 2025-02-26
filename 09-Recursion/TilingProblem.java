// given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 x 1 tiles. 
// A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.


public class TilingProblem {
    
    //find the number of ways to tile the board
    //time complexity: O(2^n)
    //space complexity: O(2^n)
    public static int tiling(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }

        //recursive case
        //place the tile vertically
        int vertical = tiling(n - 1);

        //place the tile horizontally
        int horizontal = tiling(n - 2);

        //return the sum of vertical and horizontal placements
        return vertical + horizontal;
    }

    //optimized solution
    //time complexity: O(n)
    //space complexity: O(n)

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Number of ways to tile the board: " + tiling(n));
    }

}
