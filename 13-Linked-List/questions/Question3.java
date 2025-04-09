package questions;
// Question 3 :
// Swapping Nodes in a Linked List
// We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
// swapped by changing links. Swapping data of nodes may be expensive in many situations when
// data contains many fields. It may be assumed that all keys in the linked list are distinct.
// Sample Input 1 : 1->2->3->4,  x = 2, y = 4
// Sample Output 1 : 1->4->3->2

public class Question3 {
    
    // Node class representing each element of the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to swap nodes x and y in the linked list by updating links, not data
    public static Node swapNodes(Node head, int x, int y) {
        // If the values are the same or list is empty, no need to swap
        if (head == null || x == y) return head;

        // Find the node with value x and its previous node
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // Find the node with value y and its previous node
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present in the list, do nothing
        if (currX == null || currY == null) return head;

        // If x is not head, update the previous node of x to point to y
        if (prevX != null) {
            prevX.next = currY;
        } else {
            // If x is head, update head to y
            head = currY;
        }

        // If y is not head, update the previous node of y to point to x
        if (prevY != null) {
            prevY.next = currX;
        } else {
            // If y is head, update head to x
            head = currX;
        }

        // Swap the next pointers of x and y
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

    // Utility function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1->2->3->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printList(head);

        int x = 2, y = 4; // Nodes to be swapped

        // Swap nodes and print the modified list
        head = swapNodes(head, x, y);

        System.out.println("List after swapping " + x + " and " + y + ":");
        printList(head);
    }
}
