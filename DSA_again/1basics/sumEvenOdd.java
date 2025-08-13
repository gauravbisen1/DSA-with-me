import java.util.*;

public class sumEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum = 0, evenSum = 0;

        for(int idx=0; idx<n;idx++){
            int elem = sc.nextInt();

            if(elem%2==1){
                oddSum += elem;
            }else{
                evenSum += elem;
            }
        }
        System.out.println("Even sum is " + evenSum);
        System.out.println("Odd sum is "+ oddSum);
    }
}