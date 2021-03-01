public class variable {
    public static void main(String[] args) {
        byte b = 10; //字节型
        System.out.println(b);
        short c = 88;//短整形
        System.out.println(c);
        int d = 88;//整形，整形默认类型
        System.out.println(d);
        long ll = 100861111111L;//长整形，后面要加L
        System.out.println(ll);
        float fl = 100.132F;//单精度浮点型
        System.out.println(fl);
        double fe = 100.123465484;//双精度浮点型，浮点默认类型
        System.out.println(fe);
        char ch = 'a';//字符类型,只有一个字节
        System.out.println(ch);
        boolean bl = true;//布尔类型，一个字节，只有T和F
        System.out.printf("bl");
        int hello;
        hello = 123;//支持先赋予类型，在赋予值
        {
            int bog = 35;
            System.out.println(bog);//代码块中的变量只能在代码块中使用（作用域），出去就没法用了
        }
    }
}
