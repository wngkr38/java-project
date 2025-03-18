package chap12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalLambdaExample {
    public static void main(String[] args) {
        // Supplier<T>
        Supplier<String> supplier = () -> "리턴값만 있음";
        System.out.println("supplier실습 결과: " + supplier.get());

        // Consumer<T>
        Consumer<Integer> consumer = x -> System.out.println("consumer 매개값: " + x);
        consumer.accept(1234);

        // Function<T, R>
        Function<Integer, String> function = a -> String.valueOf(a);
        String returnValue = function.apply(25);
        System.out.println("Function 타입 정의, 결과: " + returnValue);

        Function<String, Integer> function2 = x -> Integer.valueOf(x) + 50;
        int returnValue2 = function2.apply("567");
        System.out.println("Integer.valueOf(x) + 50 결과: " + returnValue2);
        // Predicate<T>
        Predicate<Integer> predicate = x -> x % 2 == 1;
        if(predicate.test(3)) {
            System.out.println("1은 홀수입니다.");
        }
    }
}
