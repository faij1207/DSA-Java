public class Search {
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
    // Search for a node (iterative)
    //time complexity: O(n)
    public int itrSearch(int key){
        Node current = head;
        int index = 0;
        while(current != null){
            if(current.data == key){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    //------------------------------------------------------------------------------------------------------
    // Search for a node (recursive)
    //time complexity: O(n)
    public int helper(Node head , int key){
        //base case
        if(head == null){
            return -1;
        }
        //if the key is found
        if(head.data == key){
            return 0;
        }

        //recursive call
        int idx= helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public static void main(String[] args) {
        Search list = new Search();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);

        System.out.println("Index of 3: " + list.itrSearch(3));
        System.out.println("Index of 6: " + list.itrSearch(6));

        System.out.println("Index of 3: " + list.recSearch(3));
        System.out.println("Index of 6: " + list.recSearch(6));
    }
}
