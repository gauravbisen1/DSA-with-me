public class oddEven{
    public static void oddEven(int n){
        int bitMask = 1;
        if ((n & bitMask)==0) {
            System.out.println("The no. is even!");
        }else{
            System.out.println("The no. is odd!");
        }
    }

    public static void main(String[] args) {
        oddEven(102);
    }
}