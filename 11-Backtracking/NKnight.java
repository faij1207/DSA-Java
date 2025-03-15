public class NKnight {

    // Check if placing a knight at (row, col) is safe
    public static boolean isSafe(char board[][], int row, int col) {
        // All possible moves of a knight
        int[] dx = {-2, -1, -2, -1};
        int[] dy = {-1, -2, 1, 2};

        // Check previous rows only (as knights are placed row-wise)
        for (int i = 0; i < dx.length; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];

            if (newRow >= 0 && newCol >= 0 && newCol < board.length && board[newRow][newCol] == 'K') {
                return false;
            }
        }
        return true;
    }

    public static void nKnight(char board[][], int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Try placing a knight in each column of this row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'K'; // Place knight
                nKnight(board, row + 1); // Recur for next row
                board[row][col] = 'x'; // Backtrack
            }
        }
    }

    // Print the board
    public static void printBoard(char board[][]) {
        System.out.println("-------- Board ---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];

        // Initialize board with 'x'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nKnight(board, 0);
    }
}
