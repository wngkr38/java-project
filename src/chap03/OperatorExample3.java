package chap03;


public class OperatorExample3 {
    public static void main(String[] args) {
        int score[] = new int[args.length];
        char grade[] = new char[args.length];
        for(int i = 0; i < args.length; i++){
            score[i] = Integer.parseInt(args[i]);
            grade[i] =  (score[i] > 90) ? 'A' : ((score[i] > 85) ? 'B' : 'C');
            System.out.println("당신의 학점은 : " + grade[i]);
        }

    }
}
