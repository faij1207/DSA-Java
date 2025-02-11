//Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
// typically using all the original letters exactly once. 
// For example, the word anagram can be rearranged into nagaram, or the word binary into brainy . 
// Write a program to check if the given two strings are anagram or not.

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "binary";
        String str2 = "brainy";

        //Convert Strings to lowercase. why? so that we don't have to worry about case sensitivity.

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Check if length of both strings are equal or not. If not, then they can't be anagrams.

        if (str1.length() ==str2.length()) {
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            //Sort both arrays
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            //if the sorted arrays are equal, then the strings are anagrams.

            boolean result = Arrays.equals(str1Array, str2Array);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

}

//output: binary and brainy are anagrams.
