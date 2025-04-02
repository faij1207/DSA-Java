public class CycleInLL {
    
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
    // Detect cycle in linked list using Floyd's Cycle Detection Algorithm (Tortoise and Hare algorithm)
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static boolean isCycle(){
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1 step
            fast = fast.next.next; // Move fast pointer by 2 steps

            if (slow == fast) { // Cycle detected
                return true;
            }
        }
        return false; // No cycle detected
    }

    //---------------------------------------------------------------------------------------
    //remove cycle in linked list

    public static void removeCycle() {
        //check if the list is empty
        if (head == null) {
            return;
        }

        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1 step
            fast = fast.next.next; // Move fast pointer by 2 steps

            if (slow == fast) { // Cycle detected
                hasCycle = true;
                break;
            }
        }

        if (hasCycle == false) {
            return; // No cycle detected
        }

        //find meeting point
        slow = head;
        Node prev= null; // To keep track of the previous node of fast pointer
        while (slow != fast) {
            prev = fast; // Store the previous node of fast pointer
            slow = slow.next; // Move slow pointer by 1 step
            fast = fast.next; // Move fast pointer by 1 step
        }

        //remove cycle
        prev.next = null; // Set the next of the previous node of fast pointer to null
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
        CycleInLL list = new CycleInLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        // Creating a cycle for testing
        head.next.next.next.next.next = head.next; // 5 -> 2

        //checking cycle in linked list
        if (isCycle()) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
        
        // Removing cycle
        removeCycle();
        System.out.println("Cycle removed from the linked list.");
        // Printing the linked list after removing cycle
        list.printList();

    }
}
