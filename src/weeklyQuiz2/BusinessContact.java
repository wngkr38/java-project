package weeklyQuiz2;

public class BusinessContact extends Contact{
    private String companyName;

    public BusinessContact(String name ,String phoneNumber ,String companyName) {
        super(name,phoneNumber);
        this.companyName = companyName;
    }
    @Override
    public String toString(){
        return "이름: " + name + ", 전화번호: " + phoneNumber + ", 회사명: " + companyName;

    }
}
