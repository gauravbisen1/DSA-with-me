public class largestNo {
    public static int getLargest( int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            //for largest
            if (largest<numbers[i]) {
                largest = numbers[i];
            }
            //for smallest
            if (smallest>numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,55,444,987,4};
        System.out.println("Largest Value is : " + getLargest(numbers));
    }
}
