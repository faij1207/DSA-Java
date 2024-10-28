# Sorting Algorithms in Java

This directory contains Java implementations of basic sorting algorithms. Sorting is a process of arranging data in a particular order (ascending or descending). It is a fundamental operation in computer science, used to make data more accessible and to optimize other algorithms.

## Sorting Algorithms Covered

### 1. **Bubble Sort**

**Description:**  
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process continues until the list is sorted.

**Algorithm:**

1. Start from the first element and compare it with the next.
2. If the current element is greater than the next, swap them.
3. Move to the next element and repeat until the end of the list.
4. Repeat the entire process until no swaps are needed in a full pass.

**Example:**
Given the array: `[5, 3, 8, 4, 2]`

- Pass 1: `[3, 5, 4, 2, 8]`
- Pass 2: `[3, 4, 2, 5, 8]`
- Pass 3: `[3, 2, 4, 5, 8]`
- Pass 4: `[2, 3, 4, 5, 8]`

**Time Complexity:**  

- Worst-case: O(n²)  
- Average-case: O(n²)  
- Best-case: O(n) (when the array is already sorted)

**Space Complexity:**  

- O(1) (in-place sorting)

---

### 2. **Selection Sort**

**Description:**  
Selection Sort is an in-place comparison-based algorithm in which the list is divided into two parts: the sorted part at the beginning and the unsorted part at the end. It repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted part and moves it to the sorted part.

**Algorithm:**

1. Start from the first element and search the minimum element in the unsorted part.
2. Swap the found minimum with the first unsorted element.
3. Move to the next element and repeat until the entire array is sorted.

**Example:**
Given the array: `[29, 10, 14, 37, 14]`

- Pass 1: `[10, 29, 14, 37, 14]`
- Pass 2: `[10, 14, 29, 37, 14]`
- Pass 3: `[10, 14, 14, 37, 29]`
- Pass 4: `[10, 14, 14, 29, 37]`

**Time Complexity:**  

- Worst-case: O(n²)  
- Average-case: O(n²)  
- Best-case: O(n²)

**Space Complexity:**  

- O(1) (in-place sorting)

---

### 3. **Insertion Sort**

**Description:**  
Insertion Sort builds the final sorted array one item at a time. It takes each element and inserts it into its correct position in the already-sorted part of the array.

**Algorithm:**

1. Assume the first element is already sorted.
2. Take the next element and compare it with elements in the sorted part.
3. Shift all greater elements one position up to make space for the swapped element.
4. Insert the element in the correct position.
5. Repeat until the whole list is sorted.

**Example:**
Given the array: `[8, 5, 2, 9, 5]`

- Pass 1: `[5, 8, 2, 9, 5]`
- Pass 2: `[2, 5, 8, 9, 5]`
- Pass 3: `[2, 5, 8, 9, 5]`
- Pass 4: `[2, 5, 5, 8, 9]`

**Time Complexity:**

- Worst-case: O(n²)  
- Average-case: O(n²)  
- Best-case: O(n) (when the array is already sorted)

**Space Complexity:**

- O(1) (in-place sorting)

---

### 4. **Counting Sort**

**Description:**  
Counting Sort is a non-comparison-based sorting algorithm. It works by counting the number of occurrences of each unique element in the input list and uses this information to place the elements in the sorted order.

**Algorithm:**

1. Find the maximum element in the array and create a count array of that length.
2. Count the occurrence of each element and store it in the count array.
3. Modify the count array to determine the positions of elements in the sorted array.
4. Build the sorted array using the positions in the count array.

**Example:**
Given the array: `[4, 2, 2, 8, 3, 3, 1]`

1. Count array: `[0, 1, 2, 2, 1, 0, 0, 0, 1]`
2. Position array: `[0, 1, 3, 5, 6, 6, 6, 6, 7]`
3. Sorted array: `[1, 2, 2, 3, 3, 4, 8]`

**Time Complexity:**  

- Worst-case: O(n + k) (where k is the range of the input data)  
- Average-case: O(n + k)  
- Best-case: O(n + k)

**Space Complexity:**  

- O(k) (where k is the range of the input data)

---

## How to Run

```bash

javac filename.java
java filename.java

```
