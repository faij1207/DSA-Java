public class FindSubsets {

    public static void findSubsets(String str, int i, String ans) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Empty subset");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursive case
        findSubsets(str, i + 1, ans + str.charAt(i)); // include or yes call
        findSubsets(str, i + 1, ans); // exclude or no call
    }

    // using string builder
    public static void findSubsets2(String str, int i, StringBuilder ans) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Empty subset");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursive case

        // Include the current character
        ans.append(str.charAt(i));
        findSubsets2(str, i + 1, ans); // Recursive call
        ans.deleteCharAt(ans.length() - 1); // Backtracking step

        // Exclude the current character
        findSubsets2(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        // using string method
        findSubsets(str, 0, "");

        System.out.println("-----------------");
        
        // using string builder
        findSubsets2(str, 0, new StringBuilder());
    }

}
