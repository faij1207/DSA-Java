# Recursion

Recursion is a programming technique where a function calls itself to solve smaller subproblems of a larger problem. It helps in breaking down complex problems into simpler ones and is widely used in algorithms like divide and conquer, dynamic programming, and backtracking.

## Properties of Recursion

1. **Base Case:** The condition that stops recursion, preventing infinite calls.
2. **Recursive Case:** The part where the function calls itself to solve a smaller problem.
3. **Stack Memory Usage:** Each recursive call is stored in the call stack, which can lead to stack overflow if too deep.
4. **Multiple Recursive Calls:** Some problems require multiple recursive calls within a function, such as the Fibonacci sequence.

## Implemented Classes

### DecreasingNumber.java

Prints numbers in decreasing order using recursion.

- **Time Complexity:** O(n)

### IncreasingNumber.java

Prints numbers in increasing order using recursion.

- **Time Complexity:** O(n)

### Factorial.java

Computes the factorial of a number using recursion.

- **Example:** `factorial(5) = 5 * 4 * 3 * 2 * 1 = 120`

- **Time Complexity:** O(n)

### SumOfNum.java

Calculates the sum of natural numbers using recursion.

- **Example:** `sum(4) = 4 + 3 + 2 + 1 = 10`

- **Time Complexity:** O(n)

### FibonacciNum.java

Calculates the nth Fibonacci number using recursion.

- **Example:** `fib(5) = 0, 1, 1, 2, 3, 5`
- **Time Complexity:** O(2^n) (exponential)

### CheckArray.java

Checks if an array is sorted using recursion.

- **Time Complexity:** O(n)

### FindArrayKey.java

Finds the first and last occurrences of a key in an array using recursion.

- **Time Complexity:** O(n)

### Power.java

Computes x^n using recursion.

- **Optimized Power Calculation:** Uses divide and conquer approach.
- **Example:** `2^5 = 2 * 2^4`
- **Time Complexity:** O(n) (Naive), O(log n) (Optimized)

### TilingProblem.java

Counts the number of ways to tile a 2 x n board using recursion.

- **Time Complexity:** O(2^n)

### RemoveDuplicate.java

Removes duplicate characters from a string using recursion.

- **Example:** `removeDuplicates("aabbcc") → "abc"`
- **Time Complexity:** O(n)

### FriendsPairing.java

Solves the Friends Pairing Problem using recursion.

- **Time Complexity:** O(n)

### BinaryStrings.java

Counts distinct binary strings of length n without consecutive 1’s.

- **Example:** For n=3, valid strings: `000, 001, 010, 011, 100, 101`
- **Time Complexity:** O(2^n)

### TowerOfHanoi.java

Solves the Tower of Hanoi problem using recursion.

- **Example:** Moves disks from source to destination using an auxiliary pole.
- **Time Complexity:** O(2^n)

Recursion is a powerful tool, but excessive use can lead to stack overflow errors. Optimized recursion or iterative solutions can improve efficiency where necessary.

## How to Run the Programs

1. **Compile the program**:

    ```bash
    javac filename.java
    ```

2. **Run the program**:

    ```bash
    java filename
    ```
