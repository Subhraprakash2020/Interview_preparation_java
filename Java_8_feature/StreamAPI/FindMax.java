package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        int max = number.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
