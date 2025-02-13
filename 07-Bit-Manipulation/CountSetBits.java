import java.util.*;

public class CountSetBits {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
           if((n & 1) != 0) { //check our LSB
               count++;
           }
           n=n>>1; //right shift
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(countSetBits(n));
    }   
}

//output: Enter the number:15
//        4
