# ArrayList in Java

ArrayList is a resizable array implementation of the `List` interface in Java. Unlike arrays, it can dynamically grow and shrink as needed.

## Properties of ArrayList

1. **Dynamic Sizing:** Automatically resizes when elements are added or removed.
2. **Indexed Access:** Provides fast element retrieval using indexes.
3. **Allows Duplicates:** Can store duplicate values.
4. **Maintains Insertion Order:** Elements remain in the order they were added.
5. **Generic Support:** Can store objects of any data type.

## Comparing Arrays and ArrayLists

| Feature         | Array | ArrayList |
|----------------|-------|-----------|
| Size          | Fixed | Dynamic |
| Performance   | Faster | Slightly Slower |
| Memory Usage  | Less  | More |
| Type-Specific | Yes   | No (supports generics) |
| Built-in Methods | No | Yes |

### Example

```java
// Using an array
int[] arr = new int[5];
arr[0] = 10;
System.out.println(arr[0]); // Output: 10

// Using an ArrayList
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
System.out.println(list.get(0)); // Output: 10
```

## Importing and Declaring an ArrayList

```java
import java.util.ArrayList; // Import statement

ArrayList<Integer> list = new ArrayList<>(); // Declaration
```

## Implemented Classes

### 1. ArrayListOperations.java

Demonstrates basic ArrayList operations.

#### Example ArrayList Operations

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(5);
list.add(10);
System.out.println(list.contains(10)); // Output: true
```

- **Time Complexity:** O(1) for add, O(n) for remove

### 2. FindMaxMin.java

Finds the maximum and minimum values in an ArrayList.

#### Example Find Max and Min

```java
Collections.max(list); // Finds the max value
Collections.min(list); // Finds the min value
```

- **Time Complexity:** O(n)

### 3. Sorting.java

Sorts an ArrayList in ascending and descending order.

#### Example Sorting

```java
Collections.sort(list); // Ascending order
Collections.sort(list, Collections.reverseOrder()); // Descending order
```

- **Time Complexity:** O(n log n)

### 4. MultiDimensionalList.java

Demonstrates a 2D ArrayList.

#### Example Multi DimensionalList

```java
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
```

- **Time Complexity:** O(n*m)

### 5. ContainerMostWater.java

Calculates max water storage.

#### Example 1

```java
// Uses two-pointer technique
```

- **Time Complexity:** O(n)

### 6. TrapRainWater.java

Calculates trapped rainwater.

#### Example trap water

```java
// Uses left and right max boundary arrays
```

- **Time Complexity:** O(n)

### 7. PairSum.java

Finds pairs that sum to a target (sorted list).

#### Example pair sum

```java
// Uses two-pointer technique
```

- **Time Complexity:** O(n)

### 8. PairSum2.java

Finds pairs that sum to a target (sorted & rotated list).

#### Example pair sum 2

```java
// Uses modified two-pointer approach
```

- **Time Complexity:** O(n)

ArrayLists in Java provide powerful features for dynamic storage and manipulation, making them ideal for various data structures and algorithms.
