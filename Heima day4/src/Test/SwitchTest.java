package Test;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字");
        int daily = sc.nextInt();
        switch (daily) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("no");
                break;
        }
        switch (daily) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("no");
        }
    }
}
