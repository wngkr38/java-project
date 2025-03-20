package chap12.methodreferance;

public class Member {
    private String id;
    private String name;

    public Member(String id) {
        this.id = id;
        System.out.println("new Member(id) 생성자 호출");
    }
    public Member(String id , String name) {
        this.id = id;
        this.name = name;
        System.out.println("new Member(id, name) 생성자 호출");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
