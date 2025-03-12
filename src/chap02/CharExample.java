package chap02;

public class CharExample {
    public static void main(String[] args) {
        char c1= 'A';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int unicode = c1;
        System.out.println(unicode);
    }
}
