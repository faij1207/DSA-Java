
public class MergeSortLL {

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

    //find the middle of the linked list
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //middle node
    }

    //merge two sorted linked lists
    private Node merge(Node head1 ,Node head2){
        Node mergedLL= new Node(-1); //dummy node
        Node temp = mergedLL; //temp node to traverse the merged linked list

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1; //linking temp to head1
                head1 = head1.next; //moving head1 to next node
                temp = temp.next; //moving temp to next node
            }else{
                temp.next = head2; //linking temp to head2
                head2 = head2.next; //moving head2 to next node
                temp = temp.next; //moving temp to next node
            }
        }
        //if any of the linked list is not empty, link the remaining nodes to temp
        while(head1 != null){
            temp.next = head1; //linking temp to head1
            head1 = head1.next; //moving head1 to next node
            temp = temp.next; //moving temp to next node
        }
        while(head2 != null){
            temp.next = head2; //linking temp to head2
            head2 = head2.next; //moving head2 to next node
            temp = temp.next; //moving temp to next node
        }   
        return mergedLL.next; //returning the merged linked list (skipping the dummy node)
    }

    //merge sort function
    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head; //if linked list is empty or has only one node, return the head
        }

        Node mid = getMid(head); //finding the middle of the linked list

        Node rightHead=mid.next; //right half of the linked list
        mid.next = null; //breaking the linked list into two halves

        Node newLeft=mergeSort(head); //sorting the left half of the linked list
        Node newRight=mergeSort(rightHead); //sorting the right half of the linked list

        //merge
        return merge(newLeft, newRight); //merging the two sorted linked lists
    }

    public static void main(String[] args) {
        
        MergeSortLL list = new MergeSortLL();
        list.addNode(4);
        list.addNode(2);
        list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        
        System.out.println("Original Linked List:");
        list.printList();
        
        head = list.mergeSort(head);
        
        System.out.println("Sorted Linked List:");
        list.printList();
    }
}
