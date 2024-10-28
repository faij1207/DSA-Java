import java.util.*;

public class PalindromeTraingle {
    
    public static void pattern(int n){

        for(int i=1; i<=n; i++){ //outer

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //descending order
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //ascending order 
            for(int j=2; j<=i; j++){
                System.out.print(j);
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