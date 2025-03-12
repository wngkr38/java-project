package chap02;

public class NumberConvertToString {
    public static void main(String[] args) {
//        Long num1 = null;
//        String convert4 = String.valueOf(num1);
//        String convert5 = num1+"";
//        System.out.println(convert4);
//        System.out.println(convert5);
        int num = 3456;
        String convert1 = Integer.toString(num);
        String convert2 = String.valueOf(num);
        String convert3 = "" + num;
        System.out.println(convert1);
        System.out.println(convert2);
        System.out.println(convert3);

    }
}
