import java.util.*;
public class stack{
    //printStack
    public static void printStack(Stack <Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        // System.out.println();
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

    //Q2 - reverse a string using stack
    public static String reverseString(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        //reverse
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    //Q3 - reverse a stack
    public static void reverseStack(Stack <Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    //Q4 - next greater element
    

    public static void main(String[] args) {
        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);
        // printStack(s);

        // String str = "abc";
        // String result = reverseString(str);
        // System.out.println(result);

        // reverseStack(s);
        // printStack(s);

        //Q4 - next greater element
        int arr[] = { 6 , 8 , 0 , 1 , 3 };
        Stack <Integer> s = new Stack<>();
        int nxtGreater [] = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2 if else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            //3 push in s
            s.push(i);
        }

        //print next element arr
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}