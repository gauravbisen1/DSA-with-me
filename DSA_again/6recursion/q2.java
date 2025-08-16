public class q2 {
    public static void solve(int num){
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if (num == 0) {
            return;
        }
        int lastDigit = num%10;
        solve(num/10);
        System.out.print(arr[lastDigit] + " ");
    }
    public static void main(String[] args) {
        
        int num = 2004;
        solve( num);
    }
}
