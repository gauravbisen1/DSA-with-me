import java.util.Scanner;

public class primeORnot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        if (n==2) {
            System.out.println(n + "is prime number!");
        }else{

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime==true) {
                System.out.println(n + "is prime number!");
            }else{
                System.out.println(n + "is not prime number!");
            }
        }
        
        // while (div<n) { 
        //     if (n%div!=0) {
        //         System.out.println("not prime" + n);
                
        //     }else{
        //         div=div+1;
        //     }
            
        // } System.out.println(n+" is prime!");
    }
    
}
