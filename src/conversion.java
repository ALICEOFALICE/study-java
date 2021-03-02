public class conversion {
    public static void main(String[] args) {
        int a =10;//定义一个a 和 一个 b 分别为int 和byte
        byte b = 20;
        int c = a + b;//在运算过程中，byte被自动转换为int类型，并且输出结果为int
        System.out.println(c);//这就是隐式转换


        double d =10.01;//定义一个d 和 一个 e 均为双精度
        double e = 20.33;
        int f = (int)(d + e);//在运算过程中，依旧正常运算，但是运算结束后强制转换为int类型，此时已经丢失精度
        System.out.println(f);//这就是显式转换
    }

}
