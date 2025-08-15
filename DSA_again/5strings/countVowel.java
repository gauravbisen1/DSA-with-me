public class countVowel {
    public static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public static int countVowel(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                count++;  
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Gaurav";
        System.out.println(countVowel(str));
    }
}
