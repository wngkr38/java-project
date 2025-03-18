package chap12;

import java.util.function.IntSupplier;
//1.4
//3.3
public class DailyQuiz {
        public static int method(int x, int y) {
            IntSupplier supplier = () -> {
//                x *= 10; // 지역변수 변경시도
                int result = x + y;
                return result;
            };
            int result = supplier.getAsInt();
            return result;
        }

        public static void main(String[] args) {
            System.out.println(method(3, 5));
        }

}
