public class powerOfTwoOrNot {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;//return true anotherwise false
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
}
