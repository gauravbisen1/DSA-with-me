public class arrSortedorNot {
    public static boolean isSorted(int arr[],int i){
        //base case
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,1};
        System.out.println(isSorted(arr, 0));
    }
}
