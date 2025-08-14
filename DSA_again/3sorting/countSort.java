public class countSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void countSort(int arr[]){
        int maxVar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxVar = Math.max(maxVar,arr[i]);
        }
        int count[] = new int [maxVar+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = maxVar; i >= 0; i--) {
            for (int j = 1; j <= count[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,9,9,5,5,11};
        countSort(arr);
    }
}
