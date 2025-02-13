public class UpperToLowerCase {
    public static void main(String[] args) {
        // char ch = 'A';
        // System.out.println("Before converting: " + ch);
        // ch = (char) (ch | ' ');
        // System.out.println("After converting: " + ch);

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
    }
}