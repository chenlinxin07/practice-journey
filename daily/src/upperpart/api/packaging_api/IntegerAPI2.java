package upperpart.api.packaging_api;

public class IntegerAPI2 {
    static void main(String[] args) {
        //在以前包装类如何进行计算
       /* Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);*/

        //需求:要把两个数据进行相加得到结果3
        //对象之间是不能直接进行计算的。
        //步骤:
        //1.把对象进行拆箱，变成基本数据类型
        //2.相加
        //3.把得到的结果再次进行装箱(再变回包装类)

       /* int result = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(result);
        System.out.println(i3);*/

        //------------------------------------------------------------------------------------

        //在JDK5的时候提出了一个机制:自动装箱和自动拆箱
        //自动装箱:把基本数据类型会自动的变成其对应的包装类
        //自动拆箱:把包装类自动的变成其对象的基本数据类型

        //在底层，此时还会去自动调用静态方法valueof得到一个Integer对象，只不过这个动作不需要我们自己去操作了
        //自动装箱的动作
        //Integer i1 = 10;

        //Integer i2 = new Integer(10);
        //自动拆箱的动作
        //int i = i2;

        //结论：在JDK5以后，int和Integer可以看做是同一个东西，因为在内部可以自动转化。
    }
}

