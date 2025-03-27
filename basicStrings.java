import java.util.Scanner;

public class basicStrings{
    //method to print letters of string
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //syntax
        String str = "Gaurav";

        //input
        Scanner sc = new Scanner(System.in);

        //for one word only
        String name = sc.next();
        System.out.println(name);

        //for many words or sentence
        String name2 = sc.nextLine();
        System.out.println(name2);

        //length of string
        String fullName = "Gaurv Bisen";
        System.out.println(fullName.length());

        //concatenate
        String firstname = "Gaurav";
        String surname = "Bisen";
        String ConcatenateName = firstname + " " + surname;
        System.out.println(ConcatenateName);

        //charAt method
        System.out.println(ConcatenateName.charAt(0));

        //to print letters of strings
        printLetters(ConcatenateName);

    }
}