// remove duplicate characters from a string using recursion

public class RemoveDuplicate {

    // remove duplicate characters from the string
    public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]){
        //base case
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        //recursive case
        char currentChar = str.charAt(index);
        if(map [currentChar-'a']==true){
            //duplicate
            removeDuplicate(str, index+1, newStr, map);
        } else{
            //not duplicate
            map[currentChar-'a'] = true;
            removeDuplicate(str, index+1, newStr.append(currentChar), map);
        }

    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        StringBuilder newStr = new StringBuilder();
        boolean map[] = new boolean[26];
        removeDuplicate(str, 0, newStr, map);
    }
    
}
