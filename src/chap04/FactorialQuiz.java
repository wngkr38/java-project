package chap04;
public class FactorialQuiz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int factorial = 1;
        for(int i = n ; i > 0 ; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
