
//StringJoiner跟StringBuilder一样，也可以看成是一个容器，创建之后里面的内容是可变的。
//作用：提高字符串的操作效率，而且代码编写特别简洁，但是目前市场上很少有人用。
package upperpart.StringDemo.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
    static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner(",","[","]");
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //3.打印结果
        System.out.println(sj);//aaa---bbb---ccc
        //查看长度
        //该长度是最终结果长度,包括前缀后缀分隔符
        System.out.println(sj.length());
        //变成字符串
        String Str = sj.toString();
        System.out.println(Str);


    }
}
