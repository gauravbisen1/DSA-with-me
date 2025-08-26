

public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data){
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step2 - newNode.next = head;
        newNode.next = head;
        //step3 - head = newNode
        head = newNode;
    }

    //add last
    public void addLast(int data){
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step2 - tail.next = newNode;
        tail.next = newNode;
        //step3 - tail = newNode
        tail = newNode;
    }

    //print linked list
    public void print(){
        if (head == null) {
            System.out.println("Linkedlist is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add in middle
    public void add(int idx , int data){
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        //i=idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove first
    public int removeFirst(){
        if (size==0) {
            System.out.println("Linked list is empty.");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        size--;
        head = head.next;
        return val;
    }

    // remove last
    public int removeLast(){
        if (size==0) {
            System.out.println("Linked list is empty.");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev: i=size-2
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;//tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //serach - iterative
    public int iterativeSerch(int key){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    //search - recursive
    public int helper(Node head , int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head, key);
    }

    //reverse a linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //find and remove nth node from last(iterative approch)
    public void deleteNthFromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        //if we want to remove head
        if (n==size) {
            head = head.next;
            return;
        }
        //size - n
        int i = 1;
        int idxToFind = size - n;
        Node prev = head;
        while (i < idxToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //check if LL is palindrome or not

    //find mid - slow fast approch
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; // slow is my mid noode
    }

    public boolean checkPlaindrome(){

        //base/corner case
        if (head == null || head.next == null) {
            return true;
        }

        //step 1 - find mid
        Node midNode = findMid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step 3 - check left half and right half
        Node right = prev; //right half head
        Node left = head; //left hald head

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            //if true update
            left = left.next;
            right = right.next;
        }

        return true;
    }

    //detect a loop / cycle in a linked list
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false;
    }

    //remove a loop / cycle in a linked list
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;//cycle exists if true

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {//cycle doesnt exists
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle - last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        //LinkedList ll = new LinkedList();
    
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.removeFirst();
        // ll.removeLast();

        // System.out.println(ll.size);

        // System.out.println("Iterative search - " + ll.iterativeSerch(3));
        // System.out.println("Recursive search - " + ll.iterativeSerch(4));

        // ll.reverse();
        // ll.print();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(5);
        // ll.print();

        // ll.deleteNthFromEnd(3);
        
        // ll.print();
        // System.out.println(ll.checkPlaindrome());

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
