public class Deletion {

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
    // Delete first node

    public int deleteFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1) {
            int data = head.data;
            head = tail = null;
            size--;
            return data;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;       
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Deletion list = new Deletion();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);

        list.printList(); // 1->2->3->4->5->6->7->null

        list.deleteFirst();
        list.printList(); // 2->3->4->5->6->7->null
        
    }
}
