package questions;

// Odd Even Linked List
//  We have a Linked List of integers, write a function to modify the linked list such that all even
//  numbers appear before all the odd numbers in the modified linked list. Also, keep the order of
//  even and odd numbers same.
//  Sample Input 1 : 8->12->10->5->4->1->6->NULL
//  Sample Output 1 : 8->12->10->4->6->5->1->NULL
//  Sample Input 2 : 1->3->5->7->NULL
//  Sample Output 2 : 1->3->5->7->NULL

public class Question4 {
    
    // Node class to define each element in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to place even numbers before odd numbers while preserving relative order
    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) {
            // If list is empty or has only one node, no changes needed
            return head;
        }

        // Create dummy nodes to simplify appending even and odd nodes
        Node evenHead = new Node(0); // Dummy start for even sublist
        Node oddHead = new Node(0);  // Dummy start for odd sublist

        Node evenTail = evenHead; // Points to the last node of the even sublist
        Node oddTail = oddHead;   // Points to the last node of the odd sublist

        Node current = head; // Start traversing from head

        // Traverse through the entire list
        while (current != null) {
            if (current.data % 2 == 0) {
                // Append to the even sublist
                evenTail.next = current;
                evenTail = evenTail.next;
            } else {
                // Append to the odd sublist
                oddTail.next = current;
                oddTail = oddTail.next;
            }
            current = current.next;
        }

        // Link the end of the even list to the start of the odd list
        evenTail.next = oddHead.next;

        // Ensure the final node points to null to terminate the list
        oddTail.next = null;

        // Return the new head of the modified list (ignoring the dummy node)
        return evenHead.next;
    }

    public static void main(String[] args) {
        // Create the linked list: 8->12->10->5->4->1->6
        Node head = new Node(8);
        head.next = new Node(12);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(6);

        // Apply the transformation
        Node modifiedHead = oddEvenList(head);

        // Print the resulting linked list
        while (modifiedHead != null) {
            System.out.print(modifiedHead.data + "->");
            modifiedHead = modifiedHead.next;
        }
        System.out.println("NULL");
    }
}
