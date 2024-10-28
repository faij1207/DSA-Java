public class SubArray {
    public static void findSub(int num[]){
        int totalSubArray=0;
        for (int i=0; i<num.length ; i++){
            int start=i;
            for(int j=i; j<num.length; j++ ){
                int end=j;
                int sum=0;
                for(int k=start; k<=end; k++ ){
                   System.out.print(num[k]+" ");
                   sum=sum+num[k];
                } 
                System.out.print(" => (sum "+sum+") ");
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array "+totalSubArray );
    }
    public static void main (String args[]){
        int num[]={2,4,6,8,10};
        findSub(num);
    }
}


//output

// 2  => (sum 2) 
// 2 4  => (sum 6)
// 2 4 6  => (sum 12)
// 2 4 6 8  => (sum 20)
// 2 4 6 8 10  => (sum 30)

// 4  => (sum 4)
// 4 6  => (sum 10)
// 4 6 8  => (sum 18)
// 4 6 8 10  => (sum 28)

// 6  => (sum 6)
// 6 8  => (sum 14)
// 6 8 10  => (sum 24)

// 8  => (sum 8)
// 8 10  => (sum 18)

// 10  => (sum 10)

// total sub array 15