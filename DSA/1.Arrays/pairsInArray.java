public class pairsInArray {
    public static void pairsInArray(int numbers[]){
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("toatal pairs in arrays is " + totalPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,0,12};
        pairsInArray(numbers);
    }
}
