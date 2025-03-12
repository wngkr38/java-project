package chap07.abstrac;

public abstract class Phone {
    private String owner;

    public abstract void turnOff();

    public void turnOn(){
        System.out.println("폰을 켭니다");
    }
}
