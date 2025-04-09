public class DoublyLL {
    
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head ;// head of the list
    public static Node tail ;// tail of the list
    public static int size ;// size of the list

    // add node at the front of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // add node at a specific index in the list
    public void addAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
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
        head.prev = null;
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

        tail = tail.prev;
        tail.next = null;
    }


    // remove node from a specific index in the list
    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        size--;
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    // print the doubly linked
    public void printLL(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
      
        DoublyLL dll = new DoublyLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addLast(40);
        dll.addLast(50);
        dll.addAtIndex(2, 25);
        dll.printLL(); // 30<->20<->25<->10<->40<->50<->null
        dll.removeFirst();
        dll.printLL(); // 20<->25<->10<->40<->50<->null
        dll.removeLast();
        dll.printLL(); // 20<->25<->10<->40<->null
        dll.removeAtIndex(1);
        dll.printLL(); // 20<->10<->40<->null

        System.out.println("Size of the list: " + size); // Size of the list: 3
    }
}
