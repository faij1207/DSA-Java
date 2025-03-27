public class ReverseLL {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }   
    }
    
    public static Node head;
    public static Node tail;
    
    // Size of the linked list
    public static int size;

    public void addNode(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    //------------------------------------------------------------------------------------------------------
    // Reverse a linked list
    //time complexity: O(n)
    public void reverseList(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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
        ReverseLL ll = new ReverseLL();
        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);
        ll.addNode(50);
        ll.printList(); // 10->20->30->40->50->null

        ll.reverseList();
        ll.printList(); // 50->40->30->20->10->null
    }
}
