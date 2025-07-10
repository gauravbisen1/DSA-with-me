import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy:" + marks[0]);
        System.out.println("chem:" + marks[1]);
        System.out.println("maths:" + marks[2]);

        marks[2] = 100;
        System.out.println("Updated maths marks:" + marks[2]);       
        
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage is"+ percentage + "%");

        System.out.println("Length of array is " + marks.length);
    }
}