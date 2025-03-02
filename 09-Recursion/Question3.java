//We are given a string S ,we need to find the count of all contiguous substrings
//starting and ending with same character.
//input: S = "abcab"
//output: 7
//explanation: there are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b,
//out of above substrings, there are 7 substrings : a, abca, b, bcab, c, a, b. so only 7
//contiguous substrings starting and ending with same character.

//sample input: S = "aba"
//output: 4
//the substrings are: a, b, a, aba

public class Question3 {

    // public static int countSubstrings(String s, int start, int end){
    // if(start == s.length()){
    // return 0;
    // }
    // if(end == s.length()){
    // return countSubstrings(s, start + 1, start + 1);
    // }
    // if(s.charAt(start) == s.charAt(end)){
    // return 1 + countSubstrings(s, start, end + 1);
    // }
    // return countSubstrings(s, start, end + 1);
    // }

    public static int countSubstrings(String s, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        int result = countSubstrings(s, i + 1, j, n - 1) +
                countSubstrings(s, i, j - 1, n - 1) -
                countSubstrings(s, i + 1, j - 1, n - 2);

        if (s.charAt(i) == s.charAt(j)) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcab";
        int n= s.length();
        System.out.println(countSubstrings(s, 0, n - 1, n));
    }
}
