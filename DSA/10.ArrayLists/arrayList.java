import java.util.ArrayList;

public class arrayList{
    public static void main(String[] args) {
        System.out.println("ARRAYLISTS");

        ArrayList <Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(4,6);

        // list.remove(4);
        // list.set(4, 12);

        // System.out.println(list);

        int elem = list.get(list.size()-1);
        
        // System.out.println(elem);

        // System.out.println(list.contains(12));

        //reverse arraylist
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("Reverse");

        //maximum on arraylist
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum - " + max);

        
    }
}