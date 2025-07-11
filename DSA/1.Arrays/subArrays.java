public class subArrays{
    public static void printSubarrays(int numbers[]){
        int totalSubaarays = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {//to rpint
                    System.out.print(numbers[k] + " " );//subarrays
                }
                totalSubaarays++;
                System.out.println();
            }
        }
        System.out.println("Toatal Subarrays is " + totalSubaarays);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
}