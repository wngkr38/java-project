package chap10.DailyQuiz;

public class TwoContainer<T, M> {
    private T key;
    private M value;

    public void set(T key, M value){
        this.value = value;
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public M getValue() {
        return value;
    }
}
