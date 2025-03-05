import java.util.Scanner;

public class nmber1toN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n to print - ");
        int n = sc.nextInt();
        int x = 1;
        while (x<=n) {
            System.out.println(x);
            x++;
        }
        System.out.println("Number printed sucessfully");
    }
}