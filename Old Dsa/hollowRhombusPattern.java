public class hollowRhombusPattern {
    public static void hollowRhombusPattern(int n){
        for (int i = 1; i <= n; i++) {//outer loop - lines
            for (int j = 1; j <= n-i; j++) {//spaces
                System.out.print(" ");
            }
            //hollow rectangle - stars
            for (int j = 1; j <= n; j++) {//stars
                if (i==1||i==n||j==1||j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRhombusPattern(5);
    }
}
