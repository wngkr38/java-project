package chap02;

public class StringConvertToNumber {
    public static void main(String[] args) {
        String str ="12345";
        int intValue = Integer.parseInt(str);
        Integer integerValue = Integer.valueOf(str);
        Long longValue = Long.valueOf(str);
        float floatValue = Float.parseFloat(str);
        System.out.println(intValue);
        System.out.println(integerValue);
        System.out.println(longValue);
        System.out.println(floatValue);
    }
}
