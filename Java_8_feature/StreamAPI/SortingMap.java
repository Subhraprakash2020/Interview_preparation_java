package Java_8_feature.StreamAPI;

import java.util.HashMap;
import java.util.Map;

public class SortingMap {
    public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(3, "Three");
    map.put(1, "One");
    map.put(2, "Two");
    map.put(9, "Two");
    map.put(4, "Two");
    map.put(6, "Two");

    map.entrySet()
        .stream()
        .filter(entry -> entry.getKey() % 2 == 0)
        .forEach(n -> System.out.println(n.getKey()) );
    }
   
}
