import java.util.*;

public class DiamondPattern {
    public static void pattern(int n){
        // first half

        for(int i=1; i<=n; i++){ //outer

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

         // second half

         for(int i=n; i>=1; i--){ //outer

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you number :");
        int num = sc.nextInt();
        pattern(num);
    }
}


// output

// enter you number :
// 4
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

