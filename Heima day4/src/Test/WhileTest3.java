package Test;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入被除数:>");
        int dividend = sc.nextInt();
        System.out.println("输入除数:>");
        int divisor = sc.nextInt();
        int Quotient = 0;
        while (dividend > divisor){
            dividend -= divisor;
            Quotient++;
        }
        System.out.println("商是" + Quotient);
        System.out.println("余数是" + dividend);
    }
}
