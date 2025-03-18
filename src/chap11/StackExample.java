package chap11;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<>();
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(10));
        coinStack.push(new Coin(5));
        coinStack.push(new Coin(1));

        while(!coinStack.isEmpty()){
            Coin coin = coinStack.pop();
            System.out.println(coin.getValue());
        }
    }
}
