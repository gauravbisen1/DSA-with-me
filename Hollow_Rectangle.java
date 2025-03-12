public class Hollow_Rectangle{
    public static void Hollow_Rectangle(int totRows, int totCols){
        //outer loop - rows
        for(int i = 1 ; i <= totRows ; i++){
            //inner loop - column
            for(int j = 1 ; j <= totCols; j++){
                //cell - (i,j)
                if (i==1||i==totRows||j==1||j==totCols) {
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Hollow_Rectangle(4,5);
    }
}