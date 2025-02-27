// problem :- Friends Pairing Problem
// given n friends , each one can remain single or can be paired up with some other friend.Each friend can be paired only once.
//  Find out the total number of ways in which friends can remain single or can be paired up.

import java.util.Scanner;

public class FriendsPairing {

    public static int friendsPairing(int n){
        //base case
        if(n==0 || n==1 || n==2){
            return n;
        }
        //recursive case
        return friendsPairing(n-1) + friendsPairing(n-2)*(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int n = sc.nextInt();
        System.out.println("Total number of ways in which friends can remain single or can be paired up: "+friendsPairing(n));
        sc.close();
    }
    
}
