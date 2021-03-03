public class LogicalOperator {
    public static void main (String[] args) {
        System.out.println(true&&true);//这里是与语句，需要前后两者都满足才会返回true
        System.out.println(true&&false);//这里是与语句，需要前后两者都满足才会返回true，如果有一个是true，无论前后都返回false
        System.out.println(false&&true);//这里是与语句，需要前后两者都满足才会返回true，如果有一个是true，无论前后都返回false
        System.out.println(false||true);//这里是或语句，只要前后语句有一个是true，就返回true
        System.out.println(true||false);//这里是或语句，只要前后语句有一个是true，就返回true
        System.out.println(!true);//这里是否语句，直接理解为数学中的-就行
        int a = 30;
        int b = 20;
        int INTMAX = a>b?a:b;//三元运算符，如果a>b则执行第一个语句，否则执行第二个语句，两个语句之间用:隔开
        System.out.println(INTMAX);
    }
}
