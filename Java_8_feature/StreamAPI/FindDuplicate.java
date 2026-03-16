package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,2,4,5,6,7,8,9,0);
        Set<Integer> set = new HashSet<>();
        number.stream().filter(n -> !set.add(n))
        .forEach(System.out::println);
    }
}
