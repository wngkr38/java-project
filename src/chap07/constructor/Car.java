package chap07.constructor;

public class Car {
    String name;
    /*디폴트 생성자*/
    Car(String name) {
        this.name = name;
    }
    void powerOn(){
        System.out.println("power on");
    }
}
