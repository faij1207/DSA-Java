

public class FloydCharecter {
    public static void main(String args[]){
        int n=4;
        char num='A';
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }
    } 
}

// a
// b c
// d e f
// g h i j
