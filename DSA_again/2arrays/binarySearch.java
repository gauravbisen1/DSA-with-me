public class binarySearch {
    public static int  binarySearch(int arr[], int sizeOfArray, int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] <= key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,22,35,47,50,60};
        int sizeOfArray = 5; 
        int key = 50;
        System.out.println(binarySearch(arr, sizeOfArray, key));
    }
}
