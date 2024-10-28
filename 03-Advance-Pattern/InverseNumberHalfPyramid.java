import java.util.*;

public class InverseNumberHalfPyramid {
    
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you row size :");
        int num = sc.nextInt();
        pattern(num);
    }

}

// output

// enter you row size :
// 5
// 12345
// 1234
// 123
// 12
// 1