package Array;
import java.util.*;
public class LinearSearch {

    public static int search(int num[], int key){
        for (int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;// not found
    }
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
       int num[]={2,3,5,7,8,1,5,4,6,9,10};
       
       System.out.println("enter you key value :");

       int key=sc.nextInt();

       int index=search(num, key);

       if(index==-1){
        System.out.println("NOT FOUND");
       }else{
        System.out.println("key is at index " + index);
       }

   }
}
