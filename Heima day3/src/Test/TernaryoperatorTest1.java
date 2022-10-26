package Test;

import java.util.Scanner;

public class TernaryoperatorTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一只老虎体重> ");
        int weight1 = sc.nextInt();
        System.out.print("请输入第二只老虎体重> ");
        int weight2 = sc.nextInt();
        String restult = weight1 == weight2 ? "相同" : "不同";
        System.out.println(restult);
    }
}
