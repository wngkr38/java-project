package chap08.defaultmethod;

interface Predator {
    String getFood();

    default void printFood() {
        System.out.println("feed " + getFood());

    }
}