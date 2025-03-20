package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 ,2 ,3 , 4, 5);

        OptionalDouble avg = list.stream()
                .mapToInt(Integer::intValue)
                .average();
//        if(avg.isPresent()) {
//            System.out.println(avg.getAsDouble());
//        }
        avg.ifPresent(System.out::println);
    }
}
