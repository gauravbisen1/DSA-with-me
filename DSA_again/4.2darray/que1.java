public class que1{
    public static void solve(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]==7) {
                    count++;
                }
            }  
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[][] = {{5,6,7},{4,9,10},{8,7,5},{7,7,6}};
        solve(arr);
    }
}