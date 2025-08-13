public class searchInRotatedArray {
    public static int search(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start<=end) {
            int mid = (start+end)/2;

            //if target is found at mid
            if (arr[mid]==target) {
                return mid;
            } 
            //check if the left half is sorted
            else if (arr[start] <= arr[mid]){
                //if target is in left half
                if (target>= arr[start] && target <= arr[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } 
            //right half is sorted
            else {
                //if target is in the right half
                if (mid+1<=end && target >= arr[mid+1] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        //if target not found
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println("found at index : " + search(arr, target));
    }
}
