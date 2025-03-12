package chap08.defaultmethod;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper2 zookeeper = new Zookeeper2();

        Lion2 lion = new Lion2();
        zookeeper.feed(lion);

        Tiger2 tiger = new Tiger2();
        zookeeper.feed(tiger);
    }
}

class Zookeeper2 {
    void feed(Predator predator) {
        predator.printFood();
//        System.out.println("feed " + predator.getFood());
    }
}

class Tiger2 implements Predator {

    @Override
    public String getFood() {
        return "meat";
    }
}

class Lion2 implements Predator {
    @Override
    public String getFood() {
        return "meat";
    }
}

class Crocodile2 implements Predator {
    @Override
    public String getFood() {
        return "meat";
    }
}
