public class calcPower{
    public static int calcPower(int num , int pow){
        if(pow == 0){
            return 1;
        }
        int temp = calcPower(num, pow-1);
        return num * temp;
    }
    public static void main(String[] args) {
        int num = 3;
        int pow = 4;
        System.out.println(calcPower(num, pow));
    }
}