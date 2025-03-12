package chap07.abstrac;


public class SamSongPhone extends Phone {

    @Override
    public void turnOff(){
        System.out.println("samsong phone off");
    }

    public static void main(String[] args) {
        //추상 클래스로 객체 생성 불가
//        Phone phone = new Phone();
        SamSongPhone samsong = new SamSongPhone();
        samsong.turnOn();
        samsong.turnOff();
    }
}
