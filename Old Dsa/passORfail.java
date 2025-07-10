
import java.util.Scanner;

public class passORfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks to check wheater student is pass or not");
        int marks = sc.nextInt();
        String type = (marks>=33)?"passed!":"failed!";
        System.out.println(type);
    }
}
