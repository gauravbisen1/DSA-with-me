public class divisibleby2{
    static boolean isEven(int n){
        if (n%2==0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean n = isEven(11);
        System.out.println(n);
    }
}