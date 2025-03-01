// you are given numbers (eg-2019) , convert it into a String of english words like
//"two zero one nine" . use recursion. 

public class Question2 {

    static String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void convertToWords(int n){
        if(n == 0){
            return;
        }
        
        int lastDigit = n % 10;
        convertToWords(n / 10);
        System.out.print(words[lastDigit] + " ");

    }

    public static void main(String[] args) {
        int n = 2019;
        convertToWords(n);
    }
    
}
