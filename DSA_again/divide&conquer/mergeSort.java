public class mergeSort {
    public static int[] merge(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int p1 = n1-1;
        int p2 = n2-1;
        int res[] = new int [n1+n2];

        for (int p3 =res.length-1; p3 >= 0; p3--) {
            int val1 = (p1<0)? Integer.MIN_VALUE: arr1[p1];
            int val2 = (p2<0)? Integer.MIN_VALUE: arr2[p2];
            if (val1>val2) {
                res[p3] = val1;
                p1--;
            }else{
                res[p3] = val2;
                p2--;
            }
            
        }
        return res;
    }
    public static int[] mergeSort(int arr[], int left , int right){
        if (left>right) {
            return new int[]{};
        }
        if (left==right) {
            return new int[]{arr[left]};
        }
        int mid = (left+right)/2;

        int a1[] = mergeSort(arr, left, mid);
        int a2[] = mergeSort(arr, mid+1, right);
        return merge(a1, a2);
    }
    public static int[] sortArray(int arr[]){
        return  mergeSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {80,70,60,50,40,30,20,10};
        int sorted[] = sortArray(arr);
    for (int i = 0; i < sorted.length; i++) {
        System.out.print(sorted[i] + " ");
    }
    }
}
