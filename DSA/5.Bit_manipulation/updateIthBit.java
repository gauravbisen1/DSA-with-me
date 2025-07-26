public class updateIthBit {
    public static int clear_ithBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n , int i, int newBit){
        n = clear_ithBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
