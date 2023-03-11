package Lesson18;

import java.util.HashMap;
import java.util.Map;

public class Sat {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Football");
        map.put(2, "Basketball");
        map.put(3, "Baseball");
        map.put(4, "Volleyball");
        map.put(5, "Golf");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }
    }
}
