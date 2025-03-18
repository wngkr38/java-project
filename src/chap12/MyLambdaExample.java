package chap12;

public class MyLambdaExample {
    public static void main(String[] args) {
        MyFunctionalInterface inter = () -> System.out.println("매개변수가 없고 리턴값이 없는 람다 표현식");
        inter.method();

        MyFunctionalInterface2 inter2 = value ->{
            System.out.println("매개변수로 입력 받은 값: " + value);

        };
        inter2.method(10);

//        MyFunctionalInteface3 inter3 = (x, y) -> x * y;
            MyFunctionalInteface3 inter3 = (x, y) ->{
            int multiple = x *y;
            System.out.println(multiple);
            return  multiple;
        };

        inter3.method(3 , 5);

        MyFunctionalInterface4 inter4 = (value) -> {
            int a = value * value;
            System.out.println(a);
            return a;
        };
        inter4.method(4);
    }
}
