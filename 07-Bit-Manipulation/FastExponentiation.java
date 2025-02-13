public class FastExponentiation {

    public static int fastExponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check our LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(fastExponentiation(a, n));
    }
}

//output: 1024