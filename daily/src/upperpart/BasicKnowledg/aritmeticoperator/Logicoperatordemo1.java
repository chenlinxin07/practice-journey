package upperpart.BasicKnowledg.aritmeticoperator;

public class Logicoperatordemo1 {
    static void main(String[] args) {
        //1.&&
        //运行结果和单个&是一样的
        //两边都是真结果才是真
        System.out.println(true&&true);
        System.out.println(false&&false);
        System.out.println(false&&true);
        System.out.println(true&&false);

        //2.||
        //运行结果和单个|是一样的
        System.out.println(true||true);
        System.out.println(false||false);
        System.out.println(false||true);
        System.out.println(true||false);

        //3.短路运算符具有短路效果
        //简单理解:当左边表达式可以确定结果了,那右边表达式就不会再运行了
        int a = 10;
        int b = 10;
        boolean result = ++a > 12 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

    }
}
