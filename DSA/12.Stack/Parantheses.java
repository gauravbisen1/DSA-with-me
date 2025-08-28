import java.util.*;
public class Parantheses {

    //valid parantheses
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack <> ();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                //closing
                if(s.isEmpty()){//check for stack empty or not
                    return false;
                }
                if( (s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']') ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    //duplicate parantheses
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if (ch == ')') {
                int count = 0;
                // while (s.peek() != '(') {
                //     s.pop();
                //     count++;
                // }
                // if (count <1) {
                //     return true; // duplicated exists
                // } else {
                //     s.pop(); //pop opening pair
                // }
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true; // duplicated exists
                }
            } else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "({{[]}})]";
        // System.out.println(isValid(str));

        String str = "((a+b))";
        String str2 = "(a-b)";

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
        
    }
}
