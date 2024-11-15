# 05-2D-Array

This directory contains Java programs focused on 2D arrays. These programs demonstrate various algorithms and techniques to manipulate and analyze data stored in a 2D matrix.

## Description of 2D Array

A **2D array** is a collection of elements organized in rows and columns, forming a matrix. It is often used to represent grid-like data such as tables, images, or mathematical matrices. Accessing an element in a 2D array requires specifying its row and column indices.

---

## Programs Included

### 1. **SpiralMatrix.java**

**Description**:  
This program prints the elements of a matrix in a spiral order, starting from the top-left corner and spiraling inward.

**Algorithm**:

1. Define boundaries: `top`, `bottom`, `left`, `right`.
2. Traverse the matrix:
    - From `left` to `right` (top row).
    - From `top` to `bottom` (right column).
    - From `right` to `left` (bottom row).
    - From `bottom` to `top` (left column).
3. Shrink the boundaries after completing a layer.
4. Repeat until all elements are traversed.

**Time Complexity**:  

- **O(m × n)**, where `m` is the number of rows and `n` is the number of columns.

---

### 2. **DiagonalSum.java**

**Description**:  
This program calculates the sum of the primary and secondary diagonals of a square matrix.

**Algorithm**:

1. Loop through the matrix:
    - Add elements where the row index equals the column index (primary diagonal).
    - Add elements where the row index + column index equals `n - 1` (secondary diagonal).
2. If the matrix has an odd size, subtract the center element once (since it is counted twice).

**Time Complexity**:

- **O(n²)**: Using a nested loop for the sum.
- **O(n)**: Optimized version, summing diagonals in a single loop.

**Example**:

For the matrix:

```plaintext
1 2 3
4 5 6
7 8 9
```

The primary diagonal is `1 + 5 + 9 = 15`, and the secondary diagonal is `3 + 5 + 7 = 15`.

---

### 3. **StaircaseSearch.java**

**Description**:  
This program searches for a target element in a sorted 2D matrix where:

- Each row is sorted in ascending order.
- Each column is sorted in ascending order.

**Algorithm**:

1. Start from the top-right corner.
2. Compare the current element with the target:
    - If the current element equals the target, return its position.
    - If the current element is greater than the target, move left.
    - If the current element is smaller than the target, move down.
3. Continue until the target is found or the search space is exhausted.

**Time Complexity**:

- **O(m + n)**, where `m` is the number of rows and `n` is the number of columns.

**Example**:
For the matrix:

```plaintext
1 4 7
2 5 8
3 6 9
```

Searching for `5`:

- Start at `7` (top-right).
- Move left to `4`.
- Move down to `5` (found).

---

## How to Run the Programs

1. Compile the program:

    ```bash
    javac filename.java
    ```

2. Run the program:

    ```bash
    java filename
    ```

**Notes**:

- Each program is implemented to handle edge cases, such as empty matrices or matrices with a single element.
- These implementations can be used as building blocks for solving advanced matrix-related problems.
