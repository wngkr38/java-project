package chap08.zoo;

public class Sample2 {
    public static void main(String[] args) {
        Zookeeper2 zookeeper = new Zookeeper2();

        Lion2 lion = new Lion2();
        zookeeper.feed(lion);

        Tiger2 tiger = new Tiger2();
        zookeeper.feed(tiger);
    }
}
interface Predator{
        String getFood();
}
class Zookeeper2{
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}
class Tiger2 implements Predator{

    @Override
    public String getFood() {
        return "meat";
    }
}
class Lion2 implements Predator{
    @Override
    public String getFood() {
        return "meat";
    }
}
class Crocodile2 implements Predator{
    @Override
    public String getFood() {
        return "meat";
    }
}
