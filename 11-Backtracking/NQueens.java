public class NQueens {
 
    //check if the current position is safe to place the queen
    public static boolean isSafe(char board[][], int row, int col) {
        //check the column
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        
        //check the left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        //check the right diagonal
        for(int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;
    }

    static int count = 0;

    public static void nQueen (char board[][], int row) {
        //base case
        if(row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        
        //recursive case
        //column loop
        for(int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueen(board, row + 1); //fnx call step
                board[row][col] = 'x'; //backtracking step
            }           
        }
    }

    //print the board
    public static void printBoard(char board[][]) {
        System.out.println("-------- board ---------");
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 1;
        char board[][] = new char[n][n];

        //initialize the board
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueen(board, 0);

        System.out.println("totel solutions: " + count);
    }
}
