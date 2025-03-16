# Backtracking

Backtracking is an algorithmic technique for solving problems by trying out possible solutions and discarding those that fail to meet the required conditions. It is useful for problems involving permutations, combinations, and constraint satisfaction.

## Properties of Backtracking

1. **Choice:** Explore different possibilities at each step.
2. **Constraint:** Check if the current solution is valid.
3. **Goal:** Stop when a complete solution is found.
4. **Backtrack:** Undo choices when constraints are violated.

## Implemented Classes

### ChangeArr.java

Modifies an array using backtracking.

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)
- **Example Output:**

  ```bash
  Original Array: [1, 2, 3]
  Modified Array: [3, 2, 1]
  ```

### FindSubsets.java

Generates all subsets of a string using backtracking.

#### Algorithm for FindSubsets

1. Start with an empty subset.
2. Recursively add characters to form new subsets.
3. Backtrack by removing the last added character.

- **Time Complexity:** O(2^n)
- **Space Complexity:** O(n)
- **Example Output:**

  ```bash
  Input: "abc"
  Output: "", "a", "b", "c", "ab", "ac", "bc", "abc"
  ```

### FindPermutation.java'

Generates all permutations of a string.

#### Algorithm

1. Swap characters at different positions.
2. Recursively generate permutations of remaining characters.
3. Undo swaps to backtrack.

- **Time Complexity:** O(n!)
- **Space Complexity:** O(n)
- **Example Output:**

  ```bash
  Input: "abc"
  Output: "abc", "acb", "bac", "bca", "cab", "cba"
  ```

### NQueens.java

Solves the N-Queens problem using backtracking.

- **Time Complexity:** O(n!)
- **Space Complexity:** O(n^2)
- **Example Output (for N=4):**

  ```bash
  Solution 1:
  . Q . .
  . . . Q
  Q . . .
  . . Q .
  ```

### NKnight.java

Solves the N-Knights problem using backtracking.

- **Time Complexity:** O(n^2)
- **Space Complexity:** O(n^2)
- **Example Output:**

  ```bash
  Possible Knight Placements:
  K . .
  . . K
  . K .
  ```

### GrideWays.java

Counts the number of ways to move from the top-left to bottom-right in a grid.

- **Time Complexity:** O(2^n)
- **Space Complexity:** O(n)
- **Example Output:**

  ```bash
  Input: Grid 2x3
  Output: 3 paths
  ```

### Sudoku.java

Solves the Sudoku puzzle using backtracking.

- **Time Complexity:** O(9^n)
- **Space Complexity:** O(1)
- **Example Output:**

  ```bash
  Solved Sudoku Grid:
  5 3 4 | 6 7 8 | 9 1 2
  6 7 2 | 1 9 5 | 3 4 8
  ```

## Additional Problems

### Question1.java (Rat in a Maze)

Finds all possible paths for a rat to reach the destination.

- **Time Complexity:** O(4^(n^2))
- **Space Complexity:** O(n^2)
- **Example Output:**

  ```bash

 1  0  0  0
 1  1  0  0
 0  1  0  0
 0  1  1  1

```

### Question2.java (Keypad Combinations)

Generates all letter combinations for a given digit sequence.

- **Time Complexity:** O(4^n)
- **Space Complexity:** O(n)
- **Example Output:**

  ```bash
  Input: "23"
  Output: "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
  ```

### Question3.java (Knight's Tour)

Finds a path where the knight visits each square exactly once.

- **Time Complexity:** O(8^(n^2))
- **Space Complexity:** O(n^2)
- **Example Output:**

  ```bash
  0  59  38  33  30  17  8  63
  37  34  31  16  9  62  29  18
  ```

Backtracking is a powerful technique for exploring multiple possibilities efficiently, but it may require pruning strategies to optimize performance.

## How to Run the Programs

1. **Compile the program**:

    ```bash
    javac filename.java
    ```

2. **Run the program**:

    ```bash
    java filename
    ```
