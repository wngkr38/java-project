package chap12.methodreferance;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        IntBinaryOperator operator ;

        operator = (x, y) -> Calculator.staticMethod(x, y);
        operator = Calculator::staticMethod;

        int result = operator.applyAsInt(1 , 2);
        System.out.println("result: " + result);

        Calculator calculator = new Calculator();
        operator = (x, y) -> calculator.instanceMethod(x, y);
        operator = calculator::instanceMethod;

        int result2 = operator.applyAsInt(6, 7);
        System.out.println("result2: " + result2);
    }
}
