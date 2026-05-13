package upperpart.advancedsets.set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSet_Integer {
    static void main(String[] args) {
        /*
         *
         *       需求：利用TreeSet存储整数并进行排序
         *
         *
         * */

        //1.创建TreeSet对象
        TreeSet<Integer> ts = new TreeSet<>();

        //2.添加元素
        ts.add(11);
        ts.add(4);
        ts.add(5);
        ts.add(14);

        //3.打印集合
        System.out.println(ts);

        //4.遍历集合
        //迭代器
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            int a = it.next();
            System.out.println(a);
        }

        //增强for
        for (Integer t : ts) {
            System.out.println(t);
        }

        //匿名内部类
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //lamda表达式
        ts.forEach(s-> System.out.println(s));
    }
}
