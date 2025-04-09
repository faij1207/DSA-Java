# Linked List

A **Linked List** is a linear data structure where elements (nodes) are stored in non-contiguous memory. Each node contains two parts:

- Data
- Reference to the next node

Unlike arrays, linked lists can dynamically grow or shrink in size.

## Comparison: Array vs Linked List

| Feature         | Array                            | Linked List                         |
|----------------|----------------------------------|-------------------------------------|
| Size           | Fixed                            | Dynamic                              |
| Memory         | Contiguous                       | Non-contiguous                      |
| Insertion/Deletion | Costly (need shifting)         | Efficient (just change links)       |
| Access Time    | O(1) (for index)                 | O(n) (need traversal)               |

## Import and Declaration

```java
import java.util.LinkedList;

LinkedList<Integer> list = new LinkedList<>();
```

---

## Operations in Linked List

### 1. Insertion

#### a. At the beginning

**Algorithm:**

1. Create a new node.
2. Set its next to current head.
3. Make new node the head.

**Example:**

```bash
Before: 10 -> 20 -> null
Insert 5
After: 5 -> 10 -> 20 -> null
```

#### b. At the end

**Algorithm:**

1. Create a new node.
2. Traverse to last node.
3. Set last node's next to new node.

#### c. At any position

**Algorithm:**

1. Traverse to the previous node of target position.
2. Set new node's next to current node's next.
3. Link previous node to new node.

---

### 2. Deletion

#### a. From the beginning

**Algorithm:**

1. Point head to the next of current head.

#### b. From the end

**Algorithm:**

1. Traverse to second last node.
2. Set its next to null.

#### c. From any position

**Algorithm:**

1. Traverse to node before the one to delete.
2. Point its next to the next of current node.

---

## Implemented Files

### search.java

Searches for a given value in a linked list.

- **Iterative and Recursive approaches**

- **Time Complexity:** O(n)
- **Space Complexity:** O(1) iterative, O(n) recursive

### ReverseLL.java

Reverses the linked list.

**Algorithm:**

1. Initialize three pointers: prev=null, curr=head, next=null
2. Traverse and reverse the links: next = curr.next, curr.next = prev
3. Move forward: prev = curr, curr = next

**Example:**

```bash
Before: 1 -> 2 -> 3 -> null
After: 3 -> 2 -> 1 -> null
```

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### Palindrome.java

Checks if a linked list is a palindrome.

**Algorithm:**

1. Find middle using slow-fast pointer.
2. Reverse second half.
3. Compare both halves.

**Example:**

```bash
Input: 1 -> 2 -> 2 -> 1
Output: true
```

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### cycleInLL.java

Detects and removes a cycle using Floyd’s Algorithm.

**Algorithm:**

1. Use two pointers (slow & fast) to detect cycle.
2. To remove, point one to head and other where they met.
3. Move both by one till they meet again - that's start of cycle.

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### MergeSortLL.java

Sorts a linked list using merge sort.

**Algorithm:**

1. Divide list into halves recursively.
2. Merge sorted halves.

**Example:**

```bash
Before: 3 -> 1 -> 5 -> 2
After: 1 -> 2 -> 3 -> 5
```

- **Time Complexity:** O(n log n)
- **Space Complexity:** O(log n)

### ZigZagLL.java

Reorders linked list in zigzag fashion.

**Algorithm:**

1. Find mid.
2. Reverse second half.
3. Merge two halves alternately.

**Example:**

```bash
Before: 1 -> 2 -> 3 -> 4 -> 5
After: 1 -> 5 -> 2 -> 4 -> 3
```

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## Doubly Linked List

A **Doubly Linked List (DLL)** is a data structure where each node contains three parts:

- **data**: the value stored in the node
- **prev**: a reference to the previous node
- **next**: a reference to the next node

This allows traversal in both forward and backward directions.

---

## Operations

### 1. Insertion DLL

#### a. Insert at Start

**Algorithm:**

1. Create a new node with given data.
2. Set `newNode.next` to current `head`.
3. If head is not null, set `head.prev` to `newNode`.
4. Set `newNode.prev` to null.
5. Update `head` to `newNode`.

**Example:**

Before: `null <- 10 <-> 20 <-> 30 -> null`
Insert 5 at start
After: `null <- 5 <-> 10 <-> 20 <-> 30 -> null`

#### b. Insert at End

**Algorithm:**

1. Create a new node with given data.
2. Traverse to the last node.
3. Set `lastNode.next = newNode`.
4. Set `newNode.prev = lastNode`.
5. Set `newNode.next = null`.

**Example:**

Before: `null <- 10 <-> 20 -> null`
Insert 30 at end
After: `null <- 10 <-> 20 <-> 30 -> null`

#### c. Insert at Any Position

**Algorithm:**

1. Traverse to (position - 1)th node.
2. Create a new node.
3. Set `newNode.next = current.next`
4. Set `newNode.prev = current`
5. Set `current.next.prev = newNode`
6. Set `current.next = newNode`

**Example:**

Before: `null <- 10 <-> 20 <-> 40 -> null`
Insert 30 at position 3
After: `null <- 10 <-> 20 <-> 30 <-> 40 -> null`

---

### 2. Deletion DLL

#### a. Delete from Start

**Algorithm:**

1. Set `head = head.next`
2. If head is not null, set `head.prev = null`

**Example:**

Before: `null <- 10 <-> 20 <-> 30 -> null`
After deleting from start: `null <- 20 <-> 30 -> null`

#### b. Delete from End

**Algorithm:**

1. Traverse to the last node.
2. Set `lastNode.prev.next = null`

**Example:**

Before: `null <- 10 <-> 20 <-> 30 -> null`
After deleting from end: `null <- 10 <-> 20 -> null`

#### c. Delete from Any Position

**Algorithm:**

1. Traverse to the node at the given position.
2. Set `node.prev.next = node.next`
3. Set `node.next.prev = node.prev`

**Example:**

Before: `null <- 10 <-> 20 <-> 30 <-> 40 -> null`
Delete 30 (position 3)
After: `null <- 10 <-> 20 <-> 40 -> null`

---

## Circular Linked List

A **Circular Linked List (CLL)** is a variation of a linked list where the last node points back to the first node, forming a circle. It can be singly or doubly circular.

---

## Operations CLL

### 1. Insertion CLL

#### a. Insert at Start of the CLL

**Algorithm:**

1. Create a new node.
2. If list is empty:
   - Set `newNode.next = newNode`
   - Set `head = newNode`
3. Else:
   - Traverse to the last node.
   - Set `newNode.next = head`
   - Update `last.next = newNode`
   - Set `head = newNode`

**Example:**

Before: `10 -> 20 -> 30 -> (back to 10)`
Insert 5 at start
After: `5 -> 10 -> 20 -> 30 -> (back to 5)`

#### b. Insert at End of the CLL

**Algorithm:**

1. Create a new node.
2. If list is empty:
   - Set `newNode.next = newNode`
   - Set `head = newNode`
3. Else:
   - Traverse to the last node.
   - Set `last.next = newNode`
   - Set `newNode.next = head`

**Example:**

Before: `10 -> 20 -> 30 -> (back to 10)`
Insert 40 at end
After: `10 -> 20 -> 30 -> 40 -> (back to 10)`

#### c. Insert at Any Position of CLL

**Algorithm:**

1. Traverse to (position - 1)th node.
2. Create new node.
3. Set `newNode.next = current.next`
4. Set `current.next = newNode`
5. If inserted at start, update `head`

**Example:**

Before: `10 -> 20 -> 40 -> (back to 10)`
Insert 30 at position 3
After: `10 -> 20 -> 30 -> 40 -> (back to 10)`

---

### 2. Deletion In CLL

#### a. Delete from Start in CLL

**Algorithm:**

1. If only one node:
   - Set `head = null`
2. Else:
   - Traverse to last node
   - Set `last.next = head.next`
   - Update `head = head.next`

**Example:**

Before: `10 -> 20 -> 30 -> (back to 10)`
After deleting from start: `20 -> 30 -> (back to 20)`

#### b. Delete from End in CLL

**Algorithm:**

1. If only one node:
   - Set `head = null`
2. Else:
   - Traverse to second-last node
   - Set `secondLast.next = head`

**Example:**

Before: `10 -> 20 -> 30 -> (back to 10)`
After deleting from end: `10 -> 20 -> (back to 10)`

#### c. Delete from Any Position in CLL

**Algorithm:**

1. Traverse to node before the position
2. Set `current.next = current.next.next`
3. If deleting head, update `head = head.next`

**Example:**

Before: `10 -> 20 -> 30 -> 40 -> (back to 10)`
Delete 30 (position 3)
After: `10 -> 20 -> 40 -> (back to 10)`

---

Circular Linked Lists are useful in applications like round-robin scheduling, circular buffers, and games where rotation or looping is needed.
