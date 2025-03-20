package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamLoopingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        OptionalInt maxValueOpt = list.stream()
                .mapToInt(x -> x.intValue())
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println(x))
                .max();
        int  maxValue = maxValueOpt.orElse(0);
        System.out.println("maxValue: ");
    }
}
