package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);

        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        String strDefualt = optional.orElse("문자열"); //optional안에 객체가 없으면 디폴드 값
        System.out.println(strDefualt);

        Optional<List<String>> optional2 = Optional.ofNullable(null);
        optional2.orElseGet(ArrayList::new);

        optional2.orElseThrow(RuntimeException::new);
    }
}
