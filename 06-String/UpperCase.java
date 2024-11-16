//for a given String convert each the first letter each word to uppercase

public class UpperCase {
    // Method to convert the first letter of each word to uppercase
    public static String toUpperCase(String str){
        // Create a StringBuilder to build the resulting string
        StringBuilder sb = new StringBuilder("");

        // Convert the first character to uppercase and append it to the StringBuilder
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Iterate through the rest of the string
        for(int i = 1; i < str.length(); i++){
            // If the current character is a space and it's not the last character
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                // Append the space to the StringBuilder
                sb.append(str.charAt(i));
                // Move to the next character and convert it to uppercase
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Append the current character as it is
                sb.append(str.charAt(i));
            }
        }
        // Return the resulting string
        return sb.toString();
    }

    public static void main(String[] args) {
        // Input string
        String str = "hi, i am craxy";

        // Print the result of converting the first letter of each word to uppercase
        System.out.println(toUpperCase(str));
    }
}

//output
//Hi, I Am Craxy
