public class findSubstrings {
    public static void findSubstrings(String str, String ans, int i ){
        //base case
        if(i == str.length()){
            if (ans.length()==0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return ;
        }
        //yes choice
        findSubstrings(str, ans+str.charAt(i), i+1);
        //no choice
        findSubstrings(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        findSubstrings(str, "", 0);

    }
}
