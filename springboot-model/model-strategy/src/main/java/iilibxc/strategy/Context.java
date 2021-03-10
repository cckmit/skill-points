package iilibxc.strategy;

public class Context {

    public static void main(String[] args) {

        int a = Calculator.ADD.exe(3, 4);  //加法运算
        int b = Calculator.SUB.exe(3, 4);  //减法运算
        System.out.println(a+" "+b);

    }

}
