import java.util.Scanner;

public class primeORnot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int div=2;
        
        while (div<n) { 
            if (n%div!=0) {
                System.out.println("not prime" + n);
                
            }else{
                div=div+1;
            }
            
        } System.out.println(n+" is prime!");
    }
    
}
