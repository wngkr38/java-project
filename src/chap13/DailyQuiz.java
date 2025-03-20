package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DailyQuiz {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();
//        answer.add(array[0]);
//        for (int i = 1; i < n; i++) {
//            if (array[i] > array[i - 1]) {
//                answer.add(array[i]);
//            }
//        }
        answer.add(array[0]);
        IntStream.range(1, n)
                .filter(i -> array[i] > array[i - 1])
                .forEach(i -> answer.add(array[i]));
        return answer;
    }

    public static void main(String[] args) {
        DailyQuiz printMoreBigNumber = new DailyQuiz();
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 숫자의 개수: ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print((i + 1)+"번째 숫자: ");
            array[i] = scanner.nextInt();
            if(array[i] > 100 && 1 < array[i]){
                i--;
                System.out.println("1부터 100사이의 숫자만 입력해 주세요");
            }
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}

