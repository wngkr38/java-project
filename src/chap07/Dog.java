package chap07;

public class Dog extends Animal{
    void sleep(int hour){
        System.out.println(name + " Zzz...for " + hour + " hours");
    }
//    Dog() {
//        System.out.println("Dog constructor");
//    }
    Dog(String name){
        super("");
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("happy");
        dog.name = "happy";
        dog.sleep();
        dog.sleep(10);
    }
}
