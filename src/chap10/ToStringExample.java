package chap10;

import chap09.Account;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 8, 0};
        System.out.println(Arrays.toString(num));

        Account[] accounts = {new Account(40000), new Account(3000)};
        System.out.println(Arrays.toString(accounts));

        System.out.println(Arrays.toString(accounts));




    }
}
