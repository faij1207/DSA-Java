import java.util.*;
public class ButterFlyPattern {
    public static void pattern(int n) {
        //first half
        for (int i = 1; i <= n; i++) { // outer-loop for rows
           // star print - i
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            // space  print  (n-i)*2
            for (int j = 1; j <= (n-i)*2; j++) { 
                System.out.print(" ");
            }
            // star print - i
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i = n; i >= 1; i--) { // outer-loop for rows
            // star print - i
             for (int j = 1; j <= i; j++) { 
                 System.out.print("*");
             }
             // space  print  (n-i)*2
             for (int j = 1; j <= (n-i)*2; j++) { 
                 System.out.print(" ");
             }
             // star print - i
             for (int j = 1; j <= i; j++) { 
                 System.out.print("*");
             }
             System.out.println();
         }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you row size :");
        int row = sc.nextInt();
       
        pattern(row);
    }
}


// output

// enter you row size :
// 4
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
