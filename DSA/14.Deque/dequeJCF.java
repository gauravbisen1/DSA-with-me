import java.util.*;

public class dequeJCF {
    public static void main(String[] args) {
        Deque <Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        System.out.println("last elem " + deque.getLast());
    }
}
