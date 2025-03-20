package chap12;

import java.util.function.IntSupplier;

//1.4
//2.4
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
/*5. int max = maxOrMin((a, b) -> a > b ? a : b);
     int min = maxOrMin((a, b) -> a < b ? a : b);
*/
    /* 6.
      public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.applyAsInt(student);
        }
        return (double) sum / students.length;
    }*/
    /* 7.
    double englishAvg = avg(Student::getEnglishScore);
    double mathAvg = avg(Student::getMathScore);

     */
}
