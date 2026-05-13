package lowerpart.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Function_MemberMethodsOthers {
    static void main(String[] args) {
        /*
        方法引用（引用成员方法）
        格式
                其他类：其他类对象::方法名
                本类：this::方法名(引用处不能是静态方法)
                父类：super::方法名(引用处不能是静态方法)
        需求：
            集合中有一些名字，按照要求过滤数据
            数据："张无忌","周芷若","赵敏","张强","张三丰"
            要求：只要以"张"开头，而且名字是3个字的

       */

        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        System.out.println("=========================================");
        //3.过滤数据（只要以"张"开头，而且名字是3个字的）
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(s-> System.out.println(s));

        System.out.println("=========================================");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length() == 3;
            }
        }).forEach(s-> System.out.println(s));



        System.out.println("=========================================");
        Function_MemberMethodsOthers so = new Function_MemberMethodsOthers();
        list.stream().filter(so::stringJudge)
                .forEach(s-> System.out.println(s));



        System.out.println("=========================================");
        //静态方法中是没有this的
        list.stream().filter(new Function_MemberMethodsOthers()::stringJudge)
                .forEach(s-> System.out.println(s));

    }


    public boolean stringJudge(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}
