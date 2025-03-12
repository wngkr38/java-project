package chap02;

public class PrimitiveTypePerfromanceExample {
    public static void main(String[] args) {

        long startMs = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0; i < 1000000; i++){
            sum += i; // primitive type 연산
        }
        long term = System.currentTimeMillis() - startMs;
        System.out.println(term + "ms");

    }
}
