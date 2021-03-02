package cn.itcast.demo;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //整数运算
        int a = 5;
        int b = 3;
        System.out.println(a + b);//加运算
        System.out.println(a - b);//减运算
        System.out.println(a * b);//乘运算
        System.out.println(a / b);//除运算
        System.out.println(a % b);//取余运算
        //浮点运算
        double c = 5;
        double d = 4;
        System.out.println(c / d);//双精度运算
        //字符和整数运算
        char e = 'a';
        int f = 3;
        System.out.print(e + f);
        //字符和字符串运算（拼串）
        System.out.println("\nhello"+"world");
        System.out.println("hello"+"123");
    }
}
