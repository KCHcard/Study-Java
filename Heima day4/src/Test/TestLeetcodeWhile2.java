package Test;

import java.util.Scanner;

public class TestLeetcodeWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个数:>");
        int num = sc.nextInt();
        int first = num;//临时变量 - 防止循环结束后num会变化
        int newnum = 0;
        while (num >= 1){
            int ge = num % 10;
            num /= 10;
            newnum = newnum * 10 + ge;
        }
        System.out.println(newnum);
        /*if(newnum == first){
            System.out.println("ture");
        }
        else{
            System.out.println("false");
            }*/
        System.out.println(newnum == first);
    }
}
