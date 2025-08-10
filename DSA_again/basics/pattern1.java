public class pattern1 {
    public static void main(String[] args) {
        int n = 5; //rows
        int m = 4; //columns

        //rectangle
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //hollow rectangle
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i==1||i==n||j==1||j==m) {
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }

        //right traingle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
