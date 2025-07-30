public class lastOccurance {
    public static int lastOccurance(int arr[],int key , int i){
        //base
        if (i==arr.length) {
            return -1;
        }

        int isFound = lastOccurance(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurance(arr, 3, 0));
    }
}
