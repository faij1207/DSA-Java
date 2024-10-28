import java.util.*;

public class InvertedRightAngle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your pattern length :");
        int n=sc.nextInt();
        // first method
        for(int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second method
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// enter your pattern length :
// 3
// ***
// **
// *
// ***
// **
// *