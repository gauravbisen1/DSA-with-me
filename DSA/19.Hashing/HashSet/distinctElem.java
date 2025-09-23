import java.util.HashSet;

public class distinctElem{
    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
         
        HashSet<Integer> set = new HashSet<>();

        for (Integer i : num) {
            set.add(i);
        }

        // for (int i = 0; i < num.length; i++) {
        //     set.add(num[i]);
        // }

        System.out.println("Distinct element count = " + set.size());
    }
}