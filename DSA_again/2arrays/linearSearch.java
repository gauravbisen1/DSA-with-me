public class linearSearch{
    public static int linearSearch(int arr[], int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,8,9,1,2,4};
        int k = 2;
        System.out.println("Found at index - " + linearSearch(arr, k));
    }
}