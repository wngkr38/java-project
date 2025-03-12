package chap07.override;

public class Child extends Parent{
    String field2;

    @Override
    void method2() {
        System.out.println("Child.method2()");
    }
    void method3(){
        System.out.println("Child.method3()");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();
    }
}
