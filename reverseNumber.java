public class reverseNumber {
    public static void main(String[] args) {
        int n = 11052004;
        while (n>0) {
            int lastDigit = n % 10; // to get last digit
            System.out.print(lastDigit + " " );
            n = n / 10;// to remove last digit
        }
        System.out.println("\n Successfull!");
    }
}
