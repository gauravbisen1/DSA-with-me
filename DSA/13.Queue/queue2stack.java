import java.util.Stack;

public class queue2stack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //is empty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add O(n)
        public static void add(int data){
            //s1 -> s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            //add new in s1
            s1.push(data);

            //s2 -> s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //remove O(n)
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }

        //peek O(n)
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
