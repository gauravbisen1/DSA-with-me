public class Inverted_rotated_half_pyramid {
    public static void Inverted_rotated_half_pyramid(int n){
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inverted_rotated_half_pyramid(4);
    }
}
