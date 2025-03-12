package chap02;

import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        Integer integerValue1 = Integer.valueOf(10);
        int integerValue2 = integerValue1;

        System.out.println(integerValue2);
    }
}
