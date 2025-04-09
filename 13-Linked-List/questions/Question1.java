package questions;
// Question 1 :
// Intersection of Two Linked Lists
// In a system there are two singly linked list. By some programming error, the end node of one
// of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a
// program to get the point where two linked lists merge

// List A: 1 → 2 → 3 → 6 → 7

// List B: 4 → 5 → 6 → 7

// We have to find the intersection part in this system

public class Question1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node headA, headB;

    // Function to find the intersection point using Two Pointer Technique
    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) return null;

        Node pointerA = headA;
        Node pointerB = headB;

        // Traverse both lists. When a pointer reaches the end,
        // redirect it to the head of the other list.
        // If there is an intersection, they will meet at that point.
        // If not, both will become null at the end.
        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA; // Can be null (no intersection) or the intersection node
    }

    public static void main(String[] args) {
        // First Linked List: 1 -> 2 -> 3 -> 6 -> 7
        headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        Node common = new Node(6);
        common.next = new Node(7);
        headA.next.next.next = common;

        // Second Linked List: 4 -> 5 -> 6 -> 7
        headB = new Node(4);
        headB.next = new Node(5);
        headB.next.next = common;

        Node intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection Point: " + intersection.data);
        } else {
            System.out.println("No Intersection Found.");
        }
    }
}
