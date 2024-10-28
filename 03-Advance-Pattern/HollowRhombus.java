import java.util.Scanner;

public class HollowRhombus {
    public static void pattern(int n){
        for(int i=1; i<=n; i++){ //outer

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=n; j++){
                if (i == 1 || j == 1 || i == n || j == n) { // boundery cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
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
//     *****
//    *   *
//   *   *
//  *   *
// *****