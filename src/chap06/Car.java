package chap06;

public class Car {
    private String name;
    private String model;
    private int maxSpeed;
    Car() {
        this.name = "초기화 값";
    }
    Car(String name) {
        this.name = name;
        this.maxSpeed = 200;
    }
    Car(String name, String model) {
        this.name = name;
        this.model = model;
        this.maxSpeed = 200;
    }
    Car(String name, String model, int maxSpeed) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    void engineStart() {
        System.out.println("Engine Start!");
    }
    int returnMaxSpeed(int speed) {
        System.out.println("현재 스피드:" + speed);
        return maxSpeed;
    }
    public static void main(String[] args) {
        Car ferrari = new Car("ferrari");
        System.out.println(ferrari.name);

        Car sonata = new Car("sonata");
        System.out.println(sonata.name);

        Car avante = new Car("avante");
        System.out.println(avante.name);

        Car car = new Car();

        Car sportage = new Car("kia", "sportage");
        Car bmw = new Car("bmw", "520d",300);
        System.out.println(bmw.name + " " + bmw.model +  " " + bmw.maxSpeed);
        bmw.engineStart();
        bmw.returnMaxSpeed(10);

    }
}
