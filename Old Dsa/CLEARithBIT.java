public class CLEARithBIT {
    public static int CLEARithBIT(int n , int i){
        int bitMASK = ~(1<<i);
        return n & bitMASK;
    }
    public static void main(String[] args) {
        System.out.println(CLEARithBIT(10, 1));
    }
}
