public class destination{
    public static float getShortestPath(String str){
        int x = 0 , y = 0 ;
        for (int i = 0; i < str.length(); i++) {
            char direc = str.charAt(i);
            //north
            if (direc == 'S') {
                y--;
            } 
            //south
            else if(direc == 'N'){
                y++;
            }
            //west
            else if(direc == 'W'){
                x--;
            }
            //east
            else {
                x++;
            }
        }
        int x2 = (x*x);
        int y2 = (y*y);
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNNS";
        System.out.println(getShortestPath(str));
    }
}