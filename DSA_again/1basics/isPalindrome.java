public class isPalindrome {
    static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(13431));
    }
}
