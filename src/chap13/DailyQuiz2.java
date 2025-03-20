package chap13;

import java.util.*;
import java.util.stream.IntStream;

public class DailyQuiz2 {
    public int[] solution(int[] array1, int[] array2) {
//        List<Integer> result = new ArrayList<>();
//        for (int num : array1) {
//            result.add(num);
//        }
//        for (int num : array2) {
//            result.add(num);
//        }
//        Collections.sort(result);
//        return result;
        // 두 배열을 합친 후 스트림으로 정렬
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()    // 스트림을 오름차순 정렬
                .toArray(); // 정렬된 결과를 배열로 반환
    }
    public static void main(String[] args) {
        DailyQuiz2 ascendingSort = new DailyQuiz2();
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 배열의 크기: ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print((i+1) + "번째 입력: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("두번째 배열의 크기: ");

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            System.out.print((i+1) + "번째 입력: ");
            array2[i] = scanner.nextInt();
        }
        System.out.print("오름차순으로 정렬된 두 배열의 합: " );
        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
