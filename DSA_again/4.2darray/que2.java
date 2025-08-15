public class que2{
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{7,9,8,6},{4,3,2,1},{7,8,6,6}};
        int n = arr.length;
        int m = arr[0].length;
        
        //sum of 2nd row
        int sumRow = 0;
        for (int j = 0; j < m; j++) {
            sumRow = sumRow + arr[1][j];
        };
        //sum of 3rd coloumn
        int sumCol = 0;
        for (int i = 0; i < n; i++) {
            sumCol = sumCol + arr[i][2];
        }
        //to print 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of second row is "+ sumRow);
        System.out.println("Sum of third column is "+ sumCol);
    }
}