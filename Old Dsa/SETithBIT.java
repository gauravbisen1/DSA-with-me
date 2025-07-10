public class SETithBIT {
    public static int SETithBIT(int n , int i){
        int bitMASK = 1<<i;
        return n|bitMASK;
    }
    public static void main(String[] args) {
        System.out.println(SETithBIT(10, 2));
    }
}
