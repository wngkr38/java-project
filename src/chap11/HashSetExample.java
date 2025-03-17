package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("윈터");
        set.add("카리나");
        set.add("닝닝");

        //Iterator 객체
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
        //향상된 for문으로 객체 출력
        for(String member : set){
            System.out.println(member);
        }
        System.out.println("size: " + set.size());
    }
}
