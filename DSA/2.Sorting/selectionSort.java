public class selectionSort {
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPosition = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }
            //swap
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " " );
        }
    }
    public static void main(String[] args) {
        int  arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
}
