public class clear_ithBit{
    public static int clear_ithBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear_ithBit(10, 1));
    }
}