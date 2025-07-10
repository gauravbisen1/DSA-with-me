import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER a :");
        int a = sc.nextInt();
        System.out.println("ENTER b :");
        int b = sc.nextInt();
        System.out.println("ENTER OPERATOR :");
        char operator = sc.next().charAt(0);
        
        switch (operator) {
            case '+' :System.out.println("a + b = " + (a+b));
                break;
            case '-' :System.out.println("a - b = " + (a-b));
                break;
            case '*' :System.out.println("a * b = " + (a*b));
                break;
            case '/' :System.out.println("a / b = " + (a/b));
                break;
            case '%': System.out.println("a % b = " + (a%b));
                break;
            default:System.out.println("not availabe ! try again.");
        }
    }
}
