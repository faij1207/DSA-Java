import java.util.*;

public class DecreasingNumber {

    public static void printDecresing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecresing(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        printDecresing(n);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)

// Input: 5
// Output: 5 4 3 2 1