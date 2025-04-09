// circular doubly linked list implementation in Java

public class CircularDLL {
    
    private Node head;
    private Node tail;
    private int size;

    // Node class for the circular doubly linked list
    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // constructor
    public CircularDLL() {
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
            head.prev = tail; // point head to tail to make it circular
        } else {
            newNode.next = head;
            newNode.prev = tail; // point new node's prev to tail
            head.prev = newNode; // point old head's prev to new node
            tail.next = newNode; // point tail's next to new node
            head = newNode; // update head to new node
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
            head.prev = tail; // point head to tail to make it circular
        } else {
            tail.next = newNode; // point old tail's next to new node
            newNode.prev = tail; // point new node's prev to old tail
            newNode.next = head; // point new node's next to head
            head.prev = newNode; // point head's prev to new node
            tail = newNode; // update tail to new node
        }
        size++;
    }

    // remove node from the front of the list
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // only one node in the list
            head = null;
            tail = null;
        } else {
            head = head.next; // update head to next node
            tail.next = head; // point tail's next to new head
            head.prev = tail; // point new head's prev to tail
        }
        size--;
    }

    // remove node from the end of the list
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // only one node in the list
            head = null;
            tail = null;
        } else {
            tail = tail.prev; // update tail to previous node
            tail.next = head; // point new tail's next to head
            head.prev = tail; // point head's prev to new tail
        }
        size--;
    }

    // display the list
    public void display() {
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
        CircularDLL list = new CircularDLL();
        list.addFirst(10);
        list.add(20);
        list.add(30);
        list.display(); // Output: 10 20 30
        list.removeFirst();
        list.display(); // Output: 20 30
        list.removeLast();
        list.display(); // Output: 20
        list.removeFirst();
        list.display(); // Output: List is empty
    }
}
