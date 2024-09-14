import java.util.*;

public class HollowRectangle {

    public static void pattern(int rows, int columns) {

        for (int i = 1; i <= rows; i++) { // outer-loop for rows
            for (int j = 1; j <= columns; j++) { // inner-loop for columns
                if (i == 1 || j == 1 || i == rows || j == columns) { // boundery cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you row size :");
        int row = sc.nextInt();
        System.out.println("enter you column size :");
        int col = sc.nextInt();
        pattern(row, col);
    }
}

// output

// enter you row size :
// 4
// enter you column size :
// 5
// *****
// *   *
// *   *
// *****