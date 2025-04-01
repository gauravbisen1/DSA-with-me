public class updateiTHbit{
    public static int CLEARithBIT(int n , int i){
        int bitMASK = ~(1<<i);
        return n & bitMASK;
    }
    public static int updateiTHbit(int n , int i , int newBit){
        n = CLEARithBIT(n, i);
        int bitMASK = newBit<<i;
        return n|bitMASK;
    }
    public static void main(String[] args) {
        System.out.println(updateiTHbit(10, 2, 1));
    }
}