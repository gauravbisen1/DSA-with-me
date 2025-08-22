import java.util.ArrayList;

public class pairSum1{
    //brute force O(n^2)
    public static boolean bruteSol(ArrayList<Integer> list, int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)+list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    //two pointer approch O(n)
    public static boolean twoPtrSol(ArrayList<Integer> list, int target){
        int LP = 0;
        int RP = list.size()-1;

        while (LP != RP) {
            //case 1
            if (list.get(LP)+list.get(RP) == target) {
                return true;
            }
            //case 2
            if (list.get(LP)+list.get(RP) < target) {
                LP++;
            } 
            //case 3
            else {
                RP--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1 ,2 ,3 ,4 ,5 ,6 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 7;

        System.out.println(bruteSol(list, target));
        System.out.println(twoPtrSol(list, target));

    }
}