public class Inverted_half_pyramid_numbers {
    public static void Inverted_rotated_half_pyramid_numbers(int n){
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inverted_rotated_half_pyramid_numbers(7);
    }
}
