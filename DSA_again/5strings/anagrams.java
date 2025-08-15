
import java.util.Arrays;

public class anagrams {
    public static boolean anagramsOne(String s, String t){
        if (s.length() != t.length()) {
            return  false;
        }
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return  Arrays.equals(arr1, arr2);
    }
    public static boolean anagramsTwo(String s, String t){
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();
        int[] count = new int[26]; // counts for a-z

        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]-'a']++;
        }
        for (int i = 0; i < arr2.length; i++) {
            count[arr2[i]-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(anagramsOne(s, t));
        System.out.println(anagramsTwo(s, t));
    }
}
