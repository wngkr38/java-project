package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d","e");

        list.stream()
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);

        List<String> list2 = Arrays.asList("Hello World" , "Java stream");

        List<String> newList2 = list2.stream()
                .flatMap(input -> Arrays.stream(input.split(" ")))
                .toList();
        System.out.println(newList2);
    }
}
