public class powerof2 {
    public static boolean isPowerofTwo(int n ){
        return n>0 && (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(0));
    }
}
