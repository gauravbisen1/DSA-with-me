
import java.util.Scanner;

public class TwoDArray {
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.println("FOUND AT CELL ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("KEY NOT FOUND!");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = new int  [3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("ENTER THE ELEMENT TO STORE IN 2D ARRAY -");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.println("THE 2D ARRAY IS -");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,5);
    }
}
