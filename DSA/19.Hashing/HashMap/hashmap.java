import java.util.*;

public class hashmap{
    public static void main(String[] args) {
        HashMap <String , Integer> hm = new HashMap<>();

        //add O(1)
        hm.put("India", 150);
        hm.put("Nepal", 50);
        hm.put("China", 100);

        System.out.println(hm);

        //get O(1)
        System.out.println(hm.get("India"));

        //containsKey O(1)
        System.out.println(hm.containsKey("India"));

        //remove O(1)
        System.out.println("Removed: " + hm.remove("China"));

        //size
        System.out.println(hm.size());

        //to clear hashmap
        hm.clear();

        //isEmpty
        System.out.println(hm.isEmpty());
        
        System.out.println(hm);
    }
}