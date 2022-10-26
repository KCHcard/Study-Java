package Ternaryoperator;

public class TenaryoperatorDemo1 {
    private static Double math;

    public static void main(String[] args) {
        //三元运算符 ？ ： ；
        int number1 = 10;
        int number2 = 20;
        int max = number1 > number2 ? number1 : number2;
        double max2 = math.max(number1, number2);
        System.out.println(max);
        System.out.println(max2);
    }
}
