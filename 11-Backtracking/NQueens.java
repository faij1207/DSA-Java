public class NQueens {
    
    public static void nQueen (char board[][], int row) {
        //base case
        if(row == board.length) {
            printBoard(board);
            return;
        }
        
        //recursive case
        //column loop
        for(int col = 0; col < board.length; col++) {
                board[row][col] = 'Q';
                nQueen(board, row + 1); //recursive call
                board[row][col] = 'x'; //backtracking step
            
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
        int n = 4;
        char board[][] = new char[n][n];

        //initialize the board
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueen(board, 0);
    }
}
