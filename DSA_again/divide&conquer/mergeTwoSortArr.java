public class mergeTwoSortArr{
    public static void merge(int arr1[],int n1, int arr2[], int n2 ){
        int p1 = n1-1;
        int p2 = n2-1;
        for (int p3 = n1+n2-1; p3 >= 0; p3--) {
            int val1 = (p1<0)? Integer.MIN_VALUE: arr1[p1];
            int val2 = (p2<0)? Integer.MIN_VALUE: arr2[p2];
            if (val1>val2) {
                arr1[p3] = val1;
                p1--;
            }else{
                arr1[p3] = val2;
                p2--;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr1[] = {10,30,40,70,80,0,0,0,0}; // size = n1+n2
        int n1 = 5;
        int arr2[] = {20,40,50,60};
        int n2 = 4;
        merge(arr1, n1, arr2, n2);
        // rint only after merge is done
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}