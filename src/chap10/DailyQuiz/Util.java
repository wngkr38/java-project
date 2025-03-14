package chap10.DailyQuiz;


public class Util<K ,V> extends Pair<K,V>{
    public Util(K key, V value) {
        super(key, value);
    }
    private K key;
    private V value;

    public void set(K key , V value) {
        this.key = key;
        this.value = value;
    }
    public static <K, V> V getValue(Pair<K, V> pair, K key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        }
        return null;
    }





}


