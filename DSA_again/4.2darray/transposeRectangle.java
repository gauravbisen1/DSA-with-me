public class transposeRectangle {
    public static void transposeRectangle(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int transpose[][] = new int [m][n];

        //iterate in orignal matrix and transfer elements to transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = arr[i][j];
            } 
        }
        //to print 2d array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = {{5,6,7},{1,2,3},{10,15,39},{60,70,80}};
        transposeRectangle(arr);
    }
}
