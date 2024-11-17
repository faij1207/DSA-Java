public class StringCompression {
    public static String compress(String str) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder compressed = new StringBuilder();

        // Count the occurrences of each character
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));  // Append the character
                if (count > 1) {
                    compressed.append(count);       // Append its count if > 1
                }
                count = 1; // Reset count
            }
        }

        // Handle the last character
        compressed.append(str.charAt(str.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbcddd";
        String result = compress(str);
        System.out.println("Compressed String: " + result);
    }
}


//output

//Compressed String: a4b3cd3

//time complexity O(n)