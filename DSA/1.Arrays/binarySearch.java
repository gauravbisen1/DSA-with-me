public class binarySearch {
    public static int binarySearch(int numbers[] , int key){
        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {
            int mid = (start+end)/2;

            //conditions
            if (numbers[mid] == key) {
                return mid;//found
            }else if (numbers[mid] < key) {
                start = mid+1;//right
            }
            else {
                end = mid-1;//left
            }
        }
        return -1;//invalid
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 12;
        System.out.println("Key at index" + binarySearch(numbers, key));
    }
}
