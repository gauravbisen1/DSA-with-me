
import java.util.Arrays;

public class distinctValueOrNot{
    //approch 1
    public static boolean distinctValueOrNot(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return  false;
    }
    //approch 2
    public static boolean containsDuplicate(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if (arr[i]==arr[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3};
        System.out.println(distinctValueOrNot(arr));
        System.out.println(containsDuplicate(arr));
    }
}