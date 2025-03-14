package chap10;

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<String> result = Util.boxing("문자"); // Box<String>
        System.out.println(result.get());

    }
}
