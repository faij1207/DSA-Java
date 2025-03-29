public class Palindrome {

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
    // Find the Middle Node using the slow and fast pointer approach.
    // Time Complexity: O(n)
    public Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by one step(+1)
            fast = fast.next.next; // Move fast pointer by two steps(+2)
        }

        return slow; // Slow pointer will be at the middle of the linked list
    }

    //--------------------------------------------------------------------------------------------------------
    

    public boolean checkPalindrome(){

        if(head == null || head.next == null) {
            return true; // Empty list or single node is a palindrome
        }

        //step 1: find the middle node of the linked list
        Node middle = findMiddle(head);

        //step 2: reverse the second half of the linked list
        Node prev = null;
        Node current = middle;
        Node next;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to the next node
        }

        Node right= prev; // This is the head of the reversed second half
        Node left = head; // This is the head of the first half

        //step 3: compare the first half and the second half of the linked list

        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next; // Move to the next node in the first half
            right = right.next; // Move to the next node in the second half
        }
        return true; // It's a palindrome   
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
        Palindrome list = new Palindrome();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);

        list.printList(); // Print the original linked list
        System.out.println("Is the linked list a palindrome ? " + list.checkPalindrome()); // Check if the linked list is a palindrome
    }
     
}
