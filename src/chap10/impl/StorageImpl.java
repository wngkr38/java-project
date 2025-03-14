package chap10.impl;

public class StorageImpl<T> implements Storage<T>{
    private T[] array;

    public StorageImpl(int capacity) {
        array = (T[]) (new Object[capacity])   ;
    }

    @Override
    public void add(T t, int index) {
        array[index] = t;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
