public class  Insertion{
    
    // Head of the linked list
    public static class Node {
        int data;
        Node next;
        
        // Constructor to create a new node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }   
    }

    // Head and tail of the linked list
    public static Node head;
    public static Node tail;

    // Function to add a new node in start of the linked list
    // Time Complexity: O(1)
    public void addNodeAtStart(int data) {
        //step 1: create a new node
        Node newNode = new Node(data);

        //check if linked list is empty
        if (head == null) {
           head= tail = newNode; 
           return;
        }

        //step 2: point new node to head
        newNode.next = head; //linking new node to head

        //step 3: make new node as head
        head = newNode;
    }

    // Function to add a new node at the end of the linked list
    // Time Complexity: O(1)
    public void addNodeAtEnd(int data) {
        //step 1: create a new node
        Node newNode = new Node(data);

        //check if linked list is empty
        if (head == null) {
           head= tail = newNode;  //if linked list is empty, then new node is both head and tail
           return;
        }

        //step 2: point tail to new node
        tail.next = newNode; //linking tail to new node

        //step 3: make new node as tail
        tail = newNode;
    }

    //print linked list
    public void printList() {
        //check if linked list is empty
        if (head == null) {
            System.out.println("Linked list is empty");
            return;       
        }
        Node temp = head;
        //traverse the linked list and print data
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Insertion ll=new Insertion();

        // Adding new node at start of the linked list
        ll.addNodeAtStart(3);
        ll.addNodeAtStart(2);

        // Adding new node at end of the linked list
        ll.addNodeAtEnd(4);
        ll.addNodeAtEnd(5);

        // Printing the linked list
        ll.printList();
    }
}
