public class maxProductSubarr {
    public static int maxProductSubarr(int arr[]){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product = product * arr[j];
                ans = Integer.max(ans, product);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        System.out.println(maxProductSubarr(arr));

    }
}
