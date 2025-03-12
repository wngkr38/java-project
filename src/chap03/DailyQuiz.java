package chap03;

public class DailyQuiz {
    public static void main(String[] args) {
        String serialNo = "123451234512345";
        System.out.println(serialNo);
        System.out.println("10" + "04");
        System.out.println("" + false);
        System.out.println('a' + 100);
        int a = 999;
        String b = "abc";
        double c = 1.23d;
        int number1 = 10;
        double number2 = 2.0;

        int result1 = number1 + (int)number2;
        int result2 = number1 - (int)number2;
        int result3 = number1 * (int)number2;
        int result4 = number1 / (int)number2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        int x= 1;
        int y = 20;
        int z = 300;
        int temp = x;
        x = y;
        y = z;
        z = temp;

    }
}
