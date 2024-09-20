public class ArrayPairs {
    public static void checkPair(int num[]){
        int tp=0;
        for (int i=0; i<num.length ; i++){
            int currNum=num[i];
            for(int j=i+1; j<num.length; j++){
                System.out.print("("+currNum+","+num[j]+")");
                tp++;
            }
        System.out.println();
        }
        System.out.println("total pair "+tp);
    }
    public static void main (String args[]){
        int num[]={2,4,6,8,10};
        checkPair(num);
    }
}
