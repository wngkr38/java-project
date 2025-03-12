package chap07;

public class InheritSample {
    public static void main(String[] args) {
        InheritB inheritB = new InheritB();
        inheritB.field1 = 1;
        inheritB.method1();

        inheritB.field2 = 2;
        inheritB.method2();
    }
}
