// Question 2 :
// Keypad Combinations
// Given a string containing digits from 2-9 inclusive, print all possible letter combinations that
// the number could represent. You can print the answer in any order.
// A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1
// does not map to any letters.
// Sample Input 1 : digits = "23"
// Sample Output 1 : "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
// Sample Input 2 : digits = "2"
// Sample Output 2 : "a", "b", "c"
// Sample Input 3 : digits = ""
// Sample Output 3 : ””

public class Question2 {

    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
            { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void letterCombinations(String D) {
        int len = D.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), D);
    }

    public static void bfs(int pos, int len, StringBuilder sb, String D) {
        if (pos == len) {
            System.out.println(sb.toString());
        } else {
            char[] letters = L[Character.getNumericValue(D.charAt(pos))];
            for (int i = 0; i < letters.length; i++)
                bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
        }
    }

    public static void main(String args[]) {
        letterCombinations("29");
    }

}
