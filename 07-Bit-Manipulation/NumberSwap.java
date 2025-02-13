public class NumberSwap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
}

//output: Before swapping: a = 10 b = 20
//        After swapping: a = 20 b = 10
