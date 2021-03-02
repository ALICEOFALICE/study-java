public class SelfIncreasing {
    public static void main(String[] args) {
        //关于自增问题
        int a = 1;
        int b = 2;
        //如果自增单独使用，那么他的自增与自减符号无论在前还是在后都没啥影响
//        b++;//执行自增
//        System.out.println(a + b);//这里将会返回4
//        System.out.println("↑这里运行的算式为a + b");
//        //如果自增进入运算符，那么将会有意义


//        //如果++在后面，则表示进行自增，但是在当前运算符中依旧为原值
//        //a + b++ = 3 因为在这里，b++虽然执行了自增，但是在现在他依旧返回原值，也就是2
//        System.out.println(a + b++);//这里将会返回3
//        System.out.println("↑这里运行的算式为a + b++");


        //如果++在前面，则表示进行自增，在当前运算符中为自增后的值
        //a + ++b = 3 因为在这里，b++虽然执行了自增，但是在现在他依旧返回原值，也就是3
        System.out.println(a + ++b);//这里将会返回4
        System.out.println("↑这里运行的算式为a + ++b");
    }



}
