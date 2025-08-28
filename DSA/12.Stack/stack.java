import java.util.*;
public class stack{
    //printStack
    public static void printStack(Stack <Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    //Q1 - push at bootom of stack
    public static void pushAtBottom(Stack <Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //Q2

    //Q3
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        printStack(s);
    }
}