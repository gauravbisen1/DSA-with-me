public class binaryToDecimal {
    static int binaryToDecimal(int n){
        int mul=1;
        int sum=0;
        while (n>0) {
            int digit = n%10;
            sum=sum+digit*mul;
            n=n/10;
            mul=mul*2;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(101));
    }
}
