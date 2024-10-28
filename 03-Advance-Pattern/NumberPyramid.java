import java.util.*;

public class NumberPyramid {
    public static void pattern(int n){
        // first half

        for(int i=1; i<=n; i++){ //outer

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
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
// 5
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
