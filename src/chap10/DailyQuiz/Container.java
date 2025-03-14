package chap10.DailyQuiz;

// 제네릭 컨테이너 클래스 선언
public class Container<T> {
    private T value;  // T 타입의 변수 선언

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
