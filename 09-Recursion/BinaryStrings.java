//Problem: Binary Strings Problem
//Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1’s.

import java.util.Scanner;

public class BinaryStrings {


    //count all possible distinct binary strings of length N such that there are no consecutive 1’s
    public static int binaryStrings(int n){
        //base case
        if(n==0 || n==1){
            return n+1;
        }
        //recursive case
        return binaryStrings(n-1) + binaryStrings(n-2);
    }

    public static void printBinaryStrings(int n, int lastPlace , String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //recursive case
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace==0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of binary string: ");
        int n = sc.nextInt();
        System.out.println("Total number of distinct binary strings of length "+n+" such that there are no consecutive 1s: "+binaryStrings(n));
        System.out.println("All possible distinct binary strings of length "+n+" such that there are no consecutive 1s: ");
        printBinaryStrings(n, 0, "");
        sc.close();
    }
    
}
