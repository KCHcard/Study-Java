package Test;

import java.util.Scanner;

public class TernaryoperatorTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个和尚身高> ");
        int height1 = sc.nextInt();
        System.out.print("请输入第二个和尚身高> ");
        int height2 = sc.nextInt();
        System.out.print("请输入第三个和尚身高> ");
        int height3 = sc.nextInt();
        int higher = height1 > height2 ? height1 : height2;
        int highest = higher > height3 ? higher : height3;
        System.out.println(highest);
    }
}
