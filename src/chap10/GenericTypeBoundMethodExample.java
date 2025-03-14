package chap10;

public class GenericTypeBoundMethodExample {
    public static void main(String[] args) {
        int result = Util.compare(4 , 5);
        System.out.println("result: " + result);

        int result2 = Util.compare(3.5 , 2.5);
        System.out.println("result2: " + result2);

//        Util.compare("a" , "b"); // 최상위 클래스가 Number인 클래스만 사용하도록 제한했기 때문에 문자열은 들어가지 않음
    }
}
