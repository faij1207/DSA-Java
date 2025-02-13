public class ModularExponentiations {
    public static int modularExponentiation(int a, int n, int m) {
        int ans = 1;
        a=a%m;// Reduce a if it's greater than m
        while (n > 0) {
            if ((n & 1) != 0) { // check our LSB
                ans = (ans * a) % m;
            }
            a = (a * a) % m;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int m = 1000000007;
        System.out.println(modularExponentiation(a, n, m));
    }
}

//output: 1024
