import java.util.*;

public class BitOperation {

    // Function to get the ith bit of a number
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Function to set the ith bit of a number
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Function to clear the ith bit of a number
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Function to update the ith bit of a number
    public static int updateIthBit(int n, int i, int v) {
        // if(v == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        n=clearIthBit(n,i);
        int bitMask = v << i;
        return n | bitMask;

        // int bitMask = ~(1 << i);
        // n = n & bitMask;
        // return n | (v << i);


    }

    // Function to clear the last i bits of a number
    public static int clearLastIBits(int n, int i) {
        int bitMask = (-1 << i);
        return n & bitMask;
    }

    // Function to clear the bits in the range i to j
    public static int clearBitInRange(int n, int i, int j) {
        int ones = ~0;
        int a = ones << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b;
        return n & mask;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the bit position: ");
        int i = sc.nextInt();

        System.out.println("The ith bit is: " + getIthBit(n, i));

        System.out.println("The number after setting the ith bit is: " + setIthBit(n, i));

        System.out.println("The number after clearing the ith bit is: " + clearIthBit(n, i));

        System.out.println("Enter the value to update the ith bit: ");
        int v = sc.nextInt();
        System.out.println("The number after updating the ith bit is: " + updateIthBit(n, i, v));

        System.out.println("Enter the number of bits to clear from the end: ");
        int j = sc.nextInt();
        System.out.println("The number after clearing the last i bits is: " + clearLastIBits(n, j));

        System.out.println("Enter the range of bits to clear: ");
        i = sc.nextInt();
        j = sc.nextInt();
        System.out.println("The number after clearing the bits in the range is: " + clearBitInRange(n, i, j));    

    }
}
