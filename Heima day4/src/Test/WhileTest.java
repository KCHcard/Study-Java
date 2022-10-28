package Test;

public class WhileTest {
    public static void main(String[] args) {
        int FoldCount = 0;
        double thick = 0.1;
        while (thick <= 8844430){
            thick *= 2;
            FoldCount++;
        }
        System.out.println(FoldCount);
    }
}
