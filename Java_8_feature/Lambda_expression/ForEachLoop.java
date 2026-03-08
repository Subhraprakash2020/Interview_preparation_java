package Java_8_feature.Lambda_expression;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,3,8,9);
        //In for each loop
        list.forEach(i -> System.out.println(i));

        //
        for(int i: list){
            System.out.println(i);
        }
    }
}
