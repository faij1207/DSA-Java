# Divide and Conquer

Divide and Conquer is an algorithmic paradigm that breaks a problem into smaller subproblems, solves them independently, and then combines their results to obtain the final solution. It is widely used for sorting, searching, and computational problems.

## Properties of Divide and Conquer

1. **Divide:** The problem is divided into smaller subproblems.
2. **Conquer:** Each subproblem is solved recursively.
3. **Combine:** The results of the subproblems are merged to get the final solution.

## Implemented Classes

### MergeSort.java

Merge Sort is a stable sorting algorithm that follows the divide and conquer approach.

**Algorithm:**

1. Divide the array into two halves recursively until each half contains a single element.
2. Conquer by sorting the two halves.
3. Merge the sorted halves to get the final sorted array.

**Example:**
Input: `[8, 4, 2, 1]`

Step-wise breakdown:

- Split: `[8, 4]` and `[2, 1]`
- Further split: `[8]`, `[4]`, `[2]`, `[1]`
- Merge step: `[4, 8]`, `[1, 2]`
- Final merge: `[1, 2, 4, 8]`

**Time Complexity:** O(n log n)

**Space Complexity:** O(n) (due to auxiliary array used in merging)

---

### QuickSort.java

Quick Sort is an efficient sorting algorithm that uses partitioning.

**Algorithm:**

1. Select a pivot element.
2. Partition the array such that elements smaller than the pivot are on the left, and larger ones are on the right.
3. Recursively apply the same process to the left and right partitions.

**Example:**
Input: `[3, 6, 8, 10, 1, 2, 1]`

Step-wise breakdown:

- Choose pivot (e.g., `1`)
- Partition: `[1, 1, 2, 3, 6, 8, 10]`
- Recursively apply to partitions `[1, 1, 2]` and `[6, 8, 10]`

**Time Complexity:** O(n log n) (average case), O(n²) (worst case if pivot selection is poor)

**Space Complexity:** O(log n) (due to recursive calls)

---

### RotatedArraySearch.java

Search an element in a rotated sorted array using binary search.

**Algorithm:**

1. Find the pivot point where the array is rotated.
2. Apply binary search on the appropriate half.

**Example:**

Input: `[4, 5, 6, 7, 0, 1, 2]`, Search key = `0`

- Pivot found at index `3`
- Apply binary search in `[0, 1, 2]`

**Time Complexity:** O(log n)

**Space Complexity:** O(1)

---

### InversionCount.java

Counts how many pairs `(i, j)` exist such that `i < j` and `arr[i] > arr[j]`.

**Algorithm:**

1. Use a modified merge sort to count inversions during merging.
2. Whenever an element from the right half is placed before an element from the left half, count the inversions.

**Example:**

Input: `[8, 4, 2, 1]`

- Pairs: `(8,4), (8,2), (8,1), (4,2), (4,1), (2,1)` → Count = `6`

**Time Complexity:** O(n log n)

**Space Complexity:** O(n)

---

Divide and Conquer is a powerful technique that optimizes performance in sorting and searching operations. Efficient implementations can significantly reduce time complexity.

## How to Run the Programs

1. **Compile the program**:

    ```bash
    javac filename.java
    ```

2. **Run the program**:

    ```bash
    java filename
    ```
