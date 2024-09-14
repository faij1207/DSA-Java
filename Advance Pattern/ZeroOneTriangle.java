import java.util.*;

public class ZeroOneTriangle {
    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) { // outer-loop for rows
            for (int j = 1; j <=i; j++) { // inner-loop for columns
                if ((i+j)%2==0) { // to check print for 0 or 1
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you row size :");
        int row = sc.nextInt();
        pattern(row);
    }
}
