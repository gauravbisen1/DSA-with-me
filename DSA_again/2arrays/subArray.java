public class subArray {
    public static void subArray(int arr[]){
        int totalSubaarays = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {//to rpint
                    System.out.print(arr[k] + " " );//subarrays
                }
                totalSubaarays++;
                System.out.println();
            } 
        }
        System.out.println("Tota subarray is "+ totalSubaarays);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        subArray(arr);
    }
}
