import java.util.*;

public class FloydNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your pattern length :");
        int n=sc.nextInt();
        int num=1;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }
    }
}


// enter your pattern length :
// 4
//  1
//  2 3
//  4 5 6
//  7 8 9 10