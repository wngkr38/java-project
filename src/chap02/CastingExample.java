package chap02;

public class CastingExample {
    public static void main(String[] args) {
        long longValue = 300;
        int intValue = (int) longValue;
        System.out.println(intValue);

        double pi = 3.14;
        int pi2 = (int) pi;
        System.out.println(pi2);

        //연산식에서 자동 타입 변환
        int intValue2 = 10;
        double doubleValue = 5.5;
        double result = intValue2 + doubleValue;
        System.out.println(result);

        int intResult = intValue2 + (int) doubleValue;
        System.out.println(intResult);
    }
}
