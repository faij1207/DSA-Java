// circular singly linked list implementation in Java

public class CircularSLL {
    
    private Node head;
    private Node tail;
    private int size;

    // Node class for the circular singly linked list
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // constructor
    public CircularSLL() {
        head = null;
        tail = null;
        size = 0;
    }

    // add node to the front of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // point tail to head to make it circular
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // point tail to head to make it circular
        }
        size++;
    }

    // add node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // point tail to head to make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // point tail to head to make it circular
        }
        size++;
    }

    // remove node from the front of the list
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head; // maintain circularity
    }

    // remove node from the end of the list
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        
        current.next = head; // maintain circularity
        tail = current; // update tail to the previous node
    }

    // print the circular singly linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        
        System.out.println();
    }

    public static void main(String[] args) {
        CircularSLL list = new CircularSLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList(); // Output: 1 2 3

        list.removeFirst();
        list.printList(); // Output: 2 3

        list.removeLast();
        list.printList(); // Output: 2
    }
}
