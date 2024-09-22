# Array File

This directory contains various Java programs to perform different operations on arrays, including searching algorithms, finding subarrays, and solving common array-based problems.

## Array Description

An **array** is a data structure consisting of a collection of elements, each identified by at least one array index or key. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

---

## Files Included:

### 1. **LinearSearch.java**

**Description:**  
A Java program to perform **Linear Search**.

**What is Linear Search?**  
Linear search is a simple search algorithm that checks every element in the list sequentially until the desired element is found.

**Algorithm:**
1. Start from the first element of the array.
2. Compare each element with the target element.
3. If the target element is found, return its index.
4. If the target is not found by the end of the array, return `-1`.

---

### 2. **BinarySearch.java**

**Description:**  
A Java program to perform **Binary Search**.

**What is Binary Search?**  
Binary search is an efficient search algorithm that works on sorted arrays by repeatedly dividing the search interval in half.

**Algorithm:**
1. Start with the middle element of the sorted array.
2. If the target value equals the middle element, return its index.
3. If the target value is less than the middle element, search in the left subarray.
4. If the target value is greater than the middle element, search in the right subarray.
5. Repeat the process until the target is found or the subarray has no elements.

---

### 3. **ReverseNumber.java**

**Description:**  
A Java program to reverse the elements of an array.

**Example:**

Input Array:  
`[1, 2, 3, 4, 5]`

Reversed Array:  
`[5, 4, 3, 2, 1]`

---

### 4. **ArrayPairs.java**

**Description:**  
A Java program to find all the pairs of elements in an array.

**Example:**

For the array `[1, 2, 3]`, the pairs are:
- `[1,2]`
- `[1,3]`
- `[2,3]`


---

### 5. **SubArray.java**

**Description:**  
A Java program to find subarrays from the main array.

**Subarray:**  
A subarray is a contiguous part of the array. It can consist of one or more elements.

Example for array `[1, 2, 3]`:
- `[1]`
- `[1, 2]`
- `[1, 2, 3]`
- `[2]`
- `[2, 3]`
- `[3]`

---

### 6. **MaxSum.java**

**Description:**  
A Java program to find the maximum sum of subarrays using the **Prefix Sum** approach.

**Prefix Sum Algorithm:**  
1. Create an array that stores the prefix sum for each element of the main array.
2. Use the prefix sum array to calculate the sum of subarrays in constant time.
3. Track the maximum sum encountered during the process.

---

### 7. **KadanesAlgorithm.java**

**Description:**  
A Java program to implement **Kadane's Algorithm**.

**What is Kadane's Algorithm?**  
Kadane's Algorithm is used to find the maximum sum subarray in an array. It runs in O(n) time.

**Algorithm:**
1. Initialize two variables: `maxSoFar` and `maxEndingHere`.
2. Traverse the array, updating `maxEndingHere` for each element.
3. If `maxEndingHere` is greater than `maxSoFar`, update `maxSoFar`.
4. Return `maxSoFar`.

**Example:**

For the array `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`:
- Maximum sum subarray is `[4, -1, 2, 1]` with sum `6`.

---

### 8. **TrappedWater.java**

**Description:**  
A Java program to calculate the amount of water trapped between the bars of a histogram (Trapping Rain Water Problem).

**Explanation:**  
Given `n` non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

**Example Image:**

![Trapped Water](images/trapped-water.png)

---

### 9. **BuyAndSellStock.java**

**Description:**  
A Java program to solve the **Buy and Sell Stock Problem**.

**Explanation:**  
Given an array where each element represents the stock price on a given day, find the maximum profit you can achieve by buying and selling at most once.

**Algorithm:**
1. Traverse the array while keeping track of the minimum price.
2. Calculate the difference between the current price and the minimum price.
3. Update the maximum profit if the difference is greater than the current maximum.

---

## How to Run:

To compile and run any of the Java programs, use the following commands:

```bash
javac filename.java
java filename
