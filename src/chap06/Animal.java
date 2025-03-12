package chap06;

public class Animal {
    String name;
    String sleep;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Animal sleep = new Animal();
        animal.setName("판다");
        animal2.setName("호랑이");
        sleep.setSleep("자고있습니다.");
        System.out.println(animal.getName() + "와" + animal2.getName()+ "가 " + sleep.sleep);
        sleep.setSleep("일어났습니다.");
        System.out.println(animal.getName() + "와" + animal2.getName()+ "가 " + sleep.sleep);
    }
}
