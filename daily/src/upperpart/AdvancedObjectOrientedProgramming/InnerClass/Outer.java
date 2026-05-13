package upperpart.AdvancedObjectOrientedProgramming.InnerClass;

//接口
interface Swim {
    public abstract void swimming();
}

public class Outer {
    private int a = 10;

//一.成员内部类
    //编写成员内部类的注意点：
    //成员内部类可以被一些修饰符所修饰，比如： private，默认，protected，public，static等
    //在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。
    //创建内部类对象时，对象中有一个隐含的Outer.this记录外部类对象的地址值
    class Inner1 {
        private int a = 20;

        public void show() {
            int a = 30;
            System.out.println(Outer.this.a);//10
            System.out.println(this.a);//20
            System.out.println(a);//3
        }
    }

    static int b = 0;

//二.静态内部类(一种特殊的成员内部类)
    //静态的东西都可以被直接用类名直接调用
    static class Inner2 {
        public void show1(){
            System.out.println("非静态的方法被调用了");
        }

        public static void show2(){
            System.out.println("静态的方法被调用了");
        }
    }

//三.局部内部类(格式)
    //class 外部类名 {
    //	数据类型 变量名;
    //
    //	修饰符 返回值类型 方法名(参数列表) {
    //		// …
    //		class 内部类 {
    //			// 成员变量
    //			// 成员方法
    //		}
    //	}
    //}

//四.匿名内部类(!!!!重要)
    //格式
    //匿名内部类必须继承一个父类或者实现一个父接口。
    //new 类名或者接口名() {
    //    重写方法;
    //};
    //什么时候用到匿名内部类
    //实际上，如果我们希望定义一个只要使用一次的类，就可考虑使用匿名内部类。匿名内部类的本质作用
    //是为了简化代码。

}
































