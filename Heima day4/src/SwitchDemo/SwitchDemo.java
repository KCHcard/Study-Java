package SwitchDemo;

public class SwitchDemo {
    public static void main(String[] args) {
        //JDK12后的switch优化
        int number = 1;
        switch (number){
            /*case 1 ->{
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            default -> {
                System.out.println("no");
            }*/
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
        }
    }
}
