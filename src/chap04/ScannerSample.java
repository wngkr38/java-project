package chap04;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        String inputValue = sc.nextLine();
        System.out.println(inputValue);
        sc.close();
    }
}
