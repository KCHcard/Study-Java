package Test;

import java.util.Scanner;

public class ArithmeticoperatorTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：>");
        int number = sc.nextInt();
        System.out.println("百位是> " + number / 100);
        System.out.println("十位是> " + number % 100 / 10);
        System.out.println("个位是> " + number % 100 % 10);
    }
}
