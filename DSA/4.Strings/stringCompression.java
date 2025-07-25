public class stringCompression {
    public static String compress(String str){
        StringBuilder newStr = new StringBuilder("");
        //String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            //newStr += str.charAt(i);
            newStr.append(str.charAt(i));
            if (count>0) {
                newStr.append(count.toString());
                //newStr += count.toString();
            }
        }
        return  newStr.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbccccdddeee";
        System.out.println(compress(str));
    }
}
