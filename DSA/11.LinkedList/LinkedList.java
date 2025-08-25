

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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
    
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        // ll.removeFirst();
        // ll.removeLast();


        ll.print();
        System.out.println(ll.size);

        System.out.println("Iterative search - " + ll.iterativeSerch(3));
        System.out.println("Recursive search - " + ll.iterativeSerch(4));
    }
}
