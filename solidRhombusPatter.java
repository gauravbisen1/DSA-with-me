public class solidRhombusPatter {
    public static void solidRhombusPattern(int n){
        for (int i = 1; i <= n; i++) {//outer loop - lines
            for (int j = 1; j <= n-i; j++) {//spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {//stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRhombusPattern(5);
    }
}
