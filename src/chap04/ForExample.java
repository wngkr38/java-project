package chap04;

public class ForExample {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        for(String str : args){
            System.out.println(str);
        }
    }
}
