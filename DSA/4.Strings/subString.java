public class subString{
    public static String subString(String str , int SI , int EI){
        String subString = "";
        for (int i = SI; i < EI; i++) {
            subString = subString + str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(subString(str, 0, 5));
        
    }
}