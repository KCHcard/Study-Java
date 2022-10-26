package Logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //& - 与 同真才真
        System.out.println(1 & 0);
        //| - 或 同假才假

        //^ - 相同为假 不同为真

        //! - 取反

        //&& - 短路与

        //|| - 短路或

        //运用
        int a = 10;
        int b = 20;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
