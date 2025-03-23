package weeklyQuiz2;

public abstract class Contact {
    protected String name;
    protected String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    @Override
    public abstract String toString();
}
