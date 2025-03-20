package chap12.methodreferance;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {
    public static void main(String args[]) {
        Function<String, Member> function;
        function = str -> new Member(str);
        function = Member::new;

        function.apply("ID1");

        BiFunction<String, String, Member> biFunction;
        biFunction = (str1, str2) -> new Member(str1, str2);
        biFunction = Member::new;

        Member member = biFunction.apply("ID", "name");
        System.out.println("member.id: " + member.getId());
        System.out.println( "member.name: " + member.getName());
    }
}
