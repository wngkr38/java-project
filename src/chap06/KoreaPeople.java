package chap06;


public class KoreaPeople {
    final String nation = "Korea";
    String name;
    KoreaPeople(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        KoreaPeople people = new KoreaPeople("이름");
        System.out.println(people.name);
        System.out.println(people.nation);
    }
}
