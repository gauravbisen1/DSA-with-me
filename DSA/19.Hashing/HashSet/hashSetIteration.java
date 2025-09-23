import java.util.*;

public class hashSetIteration {
    public static void main(String[] args) {
        HashSet <String> cities = new HashSet<>();
        cities.add("Indore");
        cities.add("Vidisha");
        cities.add("Bhopal");
        cities.add("Balaghat");
        cities.add("Mumbai");

        //using iterator interface
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        //using enchanced for loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
