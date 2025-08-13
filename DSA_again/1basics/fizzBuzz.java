import java.util.*;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ctr3=0, ctr5 =0;

        for (int idx = 1; idx <= n; idx++) {
            ctr3++;
            ctr5++;
            if ((ctr3!=3 && ctr5!=5)) {
                System.out.print(idx + " ");
            }
            else if(ctr3==3){
                System.out.print("Fizz ");
                ctr3=0;
            }
            if (ctr5==5) {
                System.out.print("Buzz ");
                ctr5=0;
            }
        }
    }
}
