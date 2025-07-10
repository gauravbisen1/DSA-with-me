public class diamondPattern {
    public static void diamondPattern(int n){
        //1st half-
        for (int i = 1; i <= n; i++) {//outer loop - lines
            for (int j = 1; j <= n-i; j++) {//spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i)-1); j++) {//stars
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half-
        for (int i = n; i >= 1; i--) {//outer loop - lines
            for (int j = 1; j <= n-i; j++) {//spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i)-1); j++) {//stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondPattern(4);
    }
}
