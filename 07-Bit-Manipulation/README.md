# 07-Bit-Manipulation

## Description

**Bit Manipulation** is a technique that involves directly working with bits, using bitwise operators to perform operations efficiently.

### Properties of Bit Manipulation

1. **Binary AND (`&`)**

   ```java
   int a = 5; // 0101
   int b = 3; // 0011
   System.out.println(a & b); // Output: 1 (0001)
   ```

2. **Binary OR (`|`)**

   ```java
   int a = 5; // 0101
   int b = 3; // 0011
   System.out.println(a | b); // Output: 7 (0111)
   ```

3. **Binary XOR (`^`)**

   ```java
   int a = 5; // 0101
   int b = 3; // 0011
   System.out.println(a ^ b); // Output: 6 (0110)
   ```

4. **1's Complement (`~`)**

   ```java
   int a = 5; // 0101
   System.out.println(~a); // Output: -6 (in 2's complement form)
   ```

5. **Left Shift (`<<`)**

   ```java
   int a = 5; // 0101
   System.out.println(a << 1); // Output: 10 (1010)
   ```

6. **Right Shift (`>>`)**

   ```java
   int a = 5; // 0101
   System.out.println(a >> 1); // Output: 2 (0010)
   ```

## Implemented Programs

### 1. BitOperation.java

**Description:** Implements bit operations (get ith bit, set ith bit, clear ith bit, update ith bit, clear last ith bit, clear range of bits).

- **Time Complexity:** O(1) per operation

### 2. CountSetBits.java

**Description:** Counts the number of ones in the binary representation of a number.

- **Time Complexity:** O(log N)

### 3. OddOrEven.java

**Description:** Determines if a number is odd or even using bit manipulation.

- **Time Complexity:** O(1)

### 4. FastExponentiation.java

**Description:** Implements fast exponentiation using bit manipulation.

- **Time Complexity:** O(log N)

### 5. ModularExponentiations.java

**Description:** Implements modular exponentiation efficiently using bit manipulation.

- **Time Complexity:** O(log N)

### 6. NumberSwap.java

**Description:** Swaps two integers using bitwise XOR.

- **Time Complexity:** O(1)

### 7. UpperToLowerCase.java

**Description:** Changes the case of a character using bit manipulation.

- **Time Complexity:** O(1)

## How to Run the Programs

1. **Compile the program**:

    ```bash
    javac filename.java
    ```

2. **Run the program**:

    ```bash
    java filename
    ```
