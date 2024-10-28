import java.util.*;
public class BinarySearch {

    public static int search(int num[], int key){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
           int num[]={0,2,4,6,8,10,12,14,16};
           
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
