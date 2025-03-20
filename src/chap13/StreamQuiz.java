package chap13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamQuiz {
    public static void main(String[] args) {
//        int sum = IntStream.rangeClosed(5, 10)
//                        .peek(System.out::print)
//                                .sum();
//        System.out.println("\n" + sum);

//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        List<Integer> numbersList = numbers.stream()
//                .map(x -> x * x)
//                .collect(Collectors.toList());
//        System.out.println(numbersList);

//        List<String> sentences = Arrays.asList("Hello:world" , "Java:stream:flatMap" , "Functional:programming");
//        List<String> setencesList = sentences.stream()
//                .flatMap(str -> Arrays.stream(str.split(":")))
//                .collect(Collectors.toList());
//        System.out.println(setencesList);

//        List<List<Integer>> numbers = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5, 6),
//                Arrays.asList(7, 8, 9)
//        );
//
//        List<Integer> numbersList = numbers.stream()
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//        System.out.println(numbersList);

//        List<Person> people = Arrays.asList(
//                new Person("Alice", 30),
//                new Person("Bob", 25),
//                new Person("Charlie", 28)
//                );
//        List<String> personList = people.stream()
//                .filter(x -> x.age >= 28)
//                .map(x -> x.name)
//                .collect(Collectors.toList());
//        System.out.println(personList);
//        List<String> personList = people.stream()
//                .map(x -> x.name)
//                .collect(Collectors.toList());
//        System.out.println(personList);
//        List<String> words = Arrays.asList("hello", "world", "java");
//        List<String> wordsList = words.stream()
//                .map(String::toUpperCase)
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(wordsList);
//        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
//        List<String> wordsList = words.stream()
//                .filter(x -> x.length() >= 5)
//                .collect(Collectors.toList());
//        System.out.println(wordsList);
//        List<Integer> numbers = Arrays.asList(5, 12, 25, 37, 48, 50, 63);
//        List<Integer> numbersFilter = numbers.stream()
//                .filter(x -> 10 < x && x < 50)
//                .collect(Collectors.toList());
//        System.out.println(numbersFilter);
        List<String> sentences = Arrays.asList("I like apples" , "Bananas are tasety" , "apple pie is delicious" , "I have an apple");
        List<String> sentencesFilter = sentences.stream()
                .filter(x -> x.contains("apple"))
                .collect(Collectors.toList());
        System.out.println(sentencesFilter);

    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

