# 06-2D-String

This directory contains Java programs to manipulate and analyze strings. Strings are sequences of characters, and they are fundamental in programming for handling text-based data.

---

## Description of Strings

A **String** in Java is a sequence of characters. Strings are immutable, meaning their value cannot be changed after they are created.

### Properties of Strings in Java

1. **Length**:
    - The length of a string is the number of characters it contains.
    - **Example**:

      ```java
      String str = "Hello";
      System.out.println(str.length()); // Output: 5
      ```

2. **Concatenation**:
    - Joining two strings together.
    - **Example**:

      ```java
      String str1 = "Hello";
      String str2 = "World";
      System.out.println(str1 + " " + str2); // Output: Hello World
      ```

3. **Substring**:
    - Extracting a portion of a string.
    - **Example**:

      ```java
      String str = "HelloWorld";
      System.out.println(str.substring(0, 5)); // Output: Hello
      ```

4. **Character at Specific Index**:
    - Retrieving a character at a specific position in the string.
    - **Example**:

      ```java
      String str = "Hello";
      System.out.println(str.charAt(1)); // Output: e
      ```

5. **Replace**:
    - Replacing characters or substrings within a string.
    - **Example**:

      ```java
      String str = "apple";
      System.out.println(str.replace('p', 'b')); // Output: abble
      ```

6. **Comparison**:
    - Comparing two strings.
    - **Example**:

      ```java
      String str1 = "Hello";
      String str2 = "World";
      System.out.println(str1.equals(str2)); // Output: false
      ```

### StringBuilder

A **StringBuilder** is a mutable alternative to String, allowing modifications without creating new objects.

- **Example**:

  ```java
  StringBuilder sb = new StringBuilder("Hello");
  sb.append(" World");
  System.out.println(sb); // Output: Hello World
  ```

### StringBuffer

A **StringBuffer** is similar to StringBuilder but is thread-safe, meaning it is synchronized and can be used safely in a multi-threaded environment.

- **Example**:

  ```java
  StringBuffer sb = new StringBuffer("Hello");
  sb.append(" World");
  System.out.println(sb); // Output: Hello World
  ```

## Programs Included

1. **ShortestPath.java**
    - **Description**: This program calculates the shortest path based on directional input (e.g., "NESW").
    - **Algorithm**:
      1. Parse the input string containing directions.
      2. Count the occurrences of each direction (N, E, S, W).
      3. Calculate the net movement in the vertical (N-S) and horizontal (E-W) directions.
      4. Use the Pythagorean theorem to compute the shortest path.
    - **Time Complexity**: O(n), where n is the length of the input string.

2. **UpperCase.java**
    - **Description**: This program capitalizes the first letter of each word in a string.
    - **Algorithm**:
      1. Split the string into words.
      2. Capitalize the first character of each word.
      3. Combine the words back into a single string.
    - **Time Complexity**: O(n), where n is the length of the input string.

3. **StringCompression.java**
    - **Description**: This program implements a string compression algorithm (e.g., "aaabbc" → "a3b2c1").
    - **Algorithm**:
      1. Traverse the string.
      2. Count consecutive characters and append them to a new string.
      3. Return the compressed string.
    - **Time Complexity**: O(n), where n is the length of the input string.

4. **Anagram.java**
    - **Description**: This program checks if two strings are anagrams (e.g., "earth" and "heart").
    - **Algorithm**:
      1. Sort both strings.
      2. Compare the sorted strings for equality.
    - **Time Complexity**: O(n log n), due to sorting.

5. **Palindrome.java**
    - **Description**: This program checks if a given string is a palindrome (reads the same forward and backward).
    - **Algorithm**:
      1. Reverse the string.
      2. Compare the original string with its reverse.
    - **Time Complexity**: O(n), where n is the length of the string.
    - **Example**:

      ```java
      // Input: racecar
      // Output: racecar = is a Palindrome

      // Input: game
      // Output: game = not a palindrome
      ```

## How to Run the Programs

1. **Compile the program**:

    ```bash
    javac filename.java
    ```

2. **Run the program**:

    ```bash
    java filename
    ```

## Notes

These programs demonstrate common string manipulation techniques in Java. They are useful for mastering algorithms and problem-solving skills.
