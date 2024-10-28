import java.util.*;
public class LeftHalfPyramid {

    public static void pattern(int n){
        for(int i=1; i<=n; i++){ //outer

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
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


//output

// enter you row size :
// 4
//    *
//   **
//  ***
// ****