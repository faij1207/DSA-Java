package questions;
// Question 5 :
// Merge k Sorted Lists
// We have K sorted linked lists of size N each, merge them and print the sorted output.
// Sample Input 1 : k = 2, n =  2
// l1 = 1->3->NULL
// l2 = 6->8->NULL
// l3 = 9->10->NULL
// Sample Output 1 : 1>3->6->8->9->10->NULL


public class Question5 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0); // Dummy node to form new list
        Node tail = dummy;

        // Merge like in merge sort
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // If any elements are left
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }

    // Function to merge K sorted linked lists
    public static Node mergeKLists(Node[] lists) {
        if (lists.length == 0) return null;

        Node merged = lists[0];
        for (int i = 1; i < lists.length; i++) {
            merged = mergeTwoLists(merged, lists[i]);
        }

        return merged;
    }

    // Utility function to print list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Sample Input
        Node l1 = new Node(1);
        l1.next = new Node(3);

        Node l2 = new Node(6);
        l2.next = new Node(8);

        Node l3 = new Node(9);
        l3.next = new Node(10);

        Node[] lists = {l1, l2, l3};

        Node mergedHead = mergeKLists(lists);
        System.out.println("Merged Sorted List:");
        printList(mergedHead);
    }
}
