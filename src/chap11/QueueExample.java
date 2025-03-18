package chap11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("첫번째");
        queue.offer("두번째");
        queue.offer("세번째");

        System.out.println(queue.peek());
        System.out.println();

        while(!queue.isEmpty()){
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
