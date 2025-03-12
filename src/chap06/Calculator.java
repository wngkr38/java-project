package chap06;

public class Calculator {
    int result;

//    int postfixOperator(int a){
//        a++;
//        return a;
//    }
    void postfixOperator(){
        this.result++;
    }
    public static void main(String[] args) {
        int a = 1;
        Calculator sample = new Calculator();
//        a = sample.postfixOperator(a);
//        System.out.println(a);
        sample.result = 1;
        sample.postfixOperator();
        System.out.println(sample.result);
    }
}
