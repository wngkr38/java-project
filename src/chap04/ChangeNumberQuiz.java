package chap04;

public class ChangeNumberQuiz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String answer = "";
        while(n > 0){
            answer += String.valueOf(n % 10);
             n /= 10;
        }
        System.out.println(answer);
    }
}
