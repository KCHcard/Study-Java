package Order_ifDemo;

import java.util.Scanner;

public class Order_ifDemo {
    public static void main(String[] args) {
        //顺序结构 - 按顺序打印

        //if语句
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入:> ");
        int wine = sc.nextInt();
        if(wine > 2){
            System.out.println("6");
        }
        else
            System.out.println("9");
    }
}
