package chap07.overload;

public class HouseDog extends Dog{
    void sleep(int hour){ // 메소드 오버로드
        System.out.println(name + "Zzzz.... for " + hour);
    }

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("puppy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
