public class Sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //check the row
        for(int i=0; i<9; i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }

        //check the column
        for(int i=0; i<9; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //check the subgrid

        int startRow = (row/3)*3;
        int startCol = (col/3)*3;

        for(int i=startRow; i<startRow+3; i++){
            for(int j=startCol; j<startCol+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row==9 ){
            return true;
        } 
        //recursive case
        int nextRow = row;
        int nextCol = col+1;
        //if we reach the last column
        if(col+1==9){
            nextRow = row+1;
            nextCol = 0;
        }

        // to check given number is not zero
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku [][]={
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Sudoku is solved");
            printSudoku(sudoku);
        } else {
            System.out.println("Sudoku cannot be solved");
        }
    }
}
