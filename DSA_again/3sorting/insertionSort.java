public class insertionSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]<key){
                //if jth element is lesser than the key then shift it on the right side
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,14,20,88};
        selectionSort(arr);
        printArr(arr);

    }
}
