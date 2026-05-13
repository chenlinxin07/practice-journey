
//StringBuilder 可以看成是一个容器，创建之后里面的内容是可变的。
//当我们在拼接字符串和反转字符串的时候会使用到

package upperpart.StringDemo.StringBuilder;

public class StringBuilderDemo1 {
    static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();

        //2.添加元素
        sb.append("我");
        sb.append("199");
        sb.append("decfef");

        //打印
        System.out.println(sb);
        //普及：
        //因为StringBuilder是Java已经写好的类
        //java在底层对他做了一些特殊处理。
        //打印对象不是地址值而是属性值

        //反转
        sb.reverse();
        System.out.println(sb);

        //变回字符串
        String Str = sb.toString();
        System.out.println(Str);


    }

}
























