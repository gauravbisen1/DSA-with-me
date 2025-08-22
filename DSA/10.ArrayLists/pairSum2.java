import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int BP = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {
                BP = i;
                break;
            }
        }
        int LP = BP+1;
        int RP = BP;
        int n = list.size();
        while (LP != RP) {
            //case 1
            if (list.get(LP) + list.get(RP) == target) {
                return true;
            }
            //case 2
            if (list.get(LP) + list.get(RP) < target) {
                LP = (LP+1)%n;
            } 
            //case 3
            else {
                RP = (n + RP - 1)%n;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //11 ,15 ,6 ,8 ,9 ,10 - sorted and rotated 
        list.add(11);
        list.add(15);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}
