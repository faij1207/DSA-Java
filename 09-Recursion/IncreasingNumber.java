import java.util.*;

public class IncreasingNumber {
    
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        printIncreasing(n);
    }
}
