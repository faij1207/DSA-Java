public class ZigZagLL {
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

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

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

    //---------------------------------------------------------------------------------------------------------
    // ZigZag linked list
    public void ZigZag() {
        //check if linked list is empty
        if (head == null) {
            System.out.println("Linked list is empty");
            return;       
        }

        //step 1: find the middle of the linked list
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; //middle node


        //step 2: reverse the second half of the linked list
        Node curr= mid.next;
        mid.next = null; //break the linked list into two halves
        Node prev = null;
        Node next ;
        while (curr != null) {
            next = curr.next; //store the next node
            curr.next = prev; //reverse the link
            prev = curr; //move prev to current node
            curr = next; //move curr to next node
        }

        Node left= head; //first half of the linked list
        Node right= prev; //second half of the linked list
        Node nextL, nextR; //next nodes of left and right linked list


        //step 3: merge the two halves of the linked list in zigzag manner
        while (left != null && right != null) {
            nextL = left.next; //store the next node of left linked list
            left.next = right; //link left to right

            nextR = right.next; //store the next node of right linked list
            right.next = nextL; //link right to left

            left = nextL; //move left to next node
            right = nextR; //move right to next node
            
        }
    }

    public static void main(String[] args) {
        ZigZagLL list = new ZigZagLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);

        System.out.println("Original Linked List:");
        list.printList();

        list.ZigZag();

        System.out.println("ZigZag Linked List:");
        list.printList();
    }

}
