// Question 1 :
//  Rat in a Maze
//  You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the
//  maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a
//  square matrix of order N * N where the cells with value 0 represent the maze’s blocked
//  locations while value 1 is the open/available path that the rat can take to reach its destination.
//  The rat's destination is at (N - 1, N - 1).
//  Your task is to find all the possible paths that the rat can take to reach from source to
//  destination in the maze.
//  The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y- 1) , 'D'(down)
//  i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).

// Sample Input : int maze[][] = 
// { { 1, 0, 0, 0 },
//  { 1, 1, 0, 1 },
//  { 0, 1, 0, 0 },
//  { 1, 1, 1, 1 } };

//  Sample Output :
//   1  0  0  0
//  1  1  0  0
//  0  1  0  0
//  0  1  1  1

public class Question1 {
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int x, int y) {
        // if (x, y outside maze) return false
        return (x >= 0 && x < maze.length
                && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y) == true) {
            if (sol[x][y] == 1)
                return false;
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String args[]) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        solveMaze(maze);
    }
}
