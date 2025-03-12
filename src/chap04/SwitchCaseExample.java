package chap04;

public class SwitchCaseExample {
    public static void main(String[] args) {
        String day = args[0];
        switch(day){
            case "월요일" :
                System.out.println("Start of the work week");
                break;
            case "화요일" ,"수요일" , "목요일" , "토요일" , "일요일" :
                System.out.println("Midweek");
                break;
            case "금요일" :
                System.out.println("Almost weekend");
                break;
            default:
                System.out.println("invalid value");
                break;
        }
    }
}
