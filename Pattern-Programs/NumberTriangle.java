import java.util.*;

public class NumberTriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your pattern length :");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// enter your pattern length :
// 4
// 1
// 12
// 123
// 1234

