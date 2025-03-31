public class binaryEvenOrOdd {
    public static void oddOReven(int n){
        int bitMask = 1;
        if ((n&bitMask)==0) {
            //even number
            System.out.println("even number");
        }else{
            //odd number
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddOReven(3);
        oddOReven(14);
    }
}
