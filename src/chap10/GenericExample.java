package chap10;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        //제네렉을 사용하지 않고 list 객체 생성
        List list = new ArrayList();
        list.add("문자열1");
        list.add(10000);
        String str = (String) list.get(0);
        String account = (String) list.get(1); //런타임 오류: ClassCastException
        //제네릭을 사용해서 list 객체 생성
        List<String> list2 = new ArrayList<>();
        list2.add("문자열");
//        list2.add(10000); // 컴파일 오류 다른 타입이 들어가는것 막아줌
        String str2 = list2.get(0); // 강제캐스팅 없어도 되는 장점
        System.out.println(str2);
    }
}
