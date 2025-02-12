import java.util.*;

 class OddOrEven {

    public static void checkOddEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        checkOddEven(n);
       
    }
}