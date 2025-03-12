package chap07.constructor;

public class SportsCar extends Car{

    SportsCar(String name){
        super(name);
    }

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("sports car");
        System.out.println(sportsCar.name);
    }
}
