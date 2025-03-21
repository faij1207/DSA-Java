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

    public static void main(String[] args) {
        Insertion ll=new Insertion();
        ll.head = new Node(1);

        // Adding new node at start of the linked list
        ll.addNodeAtStart(2);
        ll.addNodeAtStart(3);
    }
}
