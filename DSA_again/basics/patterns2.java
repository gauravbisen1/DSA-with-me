public class patterns2{
    public static void main(String[] args) {
        int n = 4;
        //pattern
        // *****
        //  ****
        //   ***
        //    **
        //     *
        // for (int i = n; i >= 1; i--) {
        //     int spaces = n-i;
        //     int stars = i;
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //kite pattern
        // for (int i = 1; i <= n; i++) {
        //     int spaces = n-i;
        //     int stars = 2*i-1;
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print("*");
        //     }
            
        //     System.out.println("");
        // }
        // for (int i = n; i >= 1; i--) {
        //     int spaces = n-i;
        //     int stars = 2*i-1;
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print("*");
        //     }
            
        //     System.out.println("");
        // }

        //palindrome pattern
        // for (int i = 1; i <= n; i++) {
        //     int spaces = n-i;
            
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     for (int j = i-1; j >= 1; j--) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //pattern cross
        
        // for (int i = 1; i <= n; i++) {
        //     int spaces = 2*(n-i);
        //     int stars = i;
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for (int i = n; i >= 1; i--) {
        //     int spaces = 2*(n-i);
        //     int stars = i;
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //no. pattern
        int count=1;
        for (int i = 1; i <= n; i++) {
            int spaces = n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }

    }
}