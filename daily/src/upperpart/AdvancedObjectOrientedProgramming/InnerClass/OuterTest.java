package upperpart.AdvancedObjectOrientedProgramming.InnerClass;

public class OuterTest {
    static void main(String[] args) {
//一.成员内部类
        Outer.Inner1 oi1 = new Outer().new Inner1();
        oi1.show();

//二.静态内部类
        //下面这行的new的对象是Inner不是Outer
        Outer.Inner2 oi2 = new Outer.Inner2();
        //静态内部类里的非静态方法
        oi2.show1();
        //静态内部类里的静态方法(两种方法都可以)
        oi2.show2();/*或者*/Outer.Inner2.show2();

//三.局部内部类
        //局部内部类 ：定义在方法中的类。类似于局部变量;

//四.匿名内部类(!!!!重要)
        // 使用匿名内部类
        new Swim() {
            @Override
            public void swimming() {
                System.out.println("自由泳...");
            }
        }.swimming();

        // 接口 变量 = new 实现类(); // 多态,走子类的重写方法
        Swim s2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("蛙泳...");
            }
        };
        s2.swimming();
    }
}
