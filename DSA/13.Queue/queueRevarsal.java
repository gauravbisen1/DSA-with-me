import java.util.*;

public class queueRevarsal {
    public static void reverse(Queue <Integer> q){
        Stack < Integer > s = new Stack<>();
        //queue -> stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        //stack -> queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
