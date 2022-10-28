package Test;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字作为范围起始> ");
        int begin = sc.nextInt();
        System.out.print("请输入一个数字作为范围末尾> ");
        int end = sc.nextInt();
        int count = 0;
        for(int num = begin; num <= end; num++){
            if(num%3 == 0 && num%5 ==0){
                System.out.println(num);
                count++;
            }
        }
        System.out.println(count);
    }
}
