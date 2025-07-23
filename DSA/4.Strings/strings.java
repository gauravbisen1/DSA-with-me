
import java.util.*;

public class strings{
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //System.out.println(name);

        String fullName1 = "Gaurav Bisen";
        System.out.println(fullName1.length());

        String firstName = "Gaurav";
        String lastName = "bisen";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);
    }
}