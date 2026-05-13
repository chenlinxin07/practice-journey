package upperpart.advancedsets.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_UniqueTraversalMethod {
    static void main(String[] args) {
        /*
            List系列集合的五种遍历方式：
                1.迭代器
                2.列表迭代器
                3.增强for
                4.Lambda表达式
                5.普通for循环
         */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println("/--------------------1--------------------/");

        //1.迭代器
        Iterator<String> it1 = list.iterator();
        while(it1.hasNext()){
            String str = it1.next();
            System.out.println(str);
        }

        System.out.println("/--------------------2--------------------/");

        //2.增强for
        //下面的变量s，其实就是一个第三方的变量而已。
        //在循环的过程中，依次表示集合中的每一个元素
       for (String s : list) {
            System.out.println(s);
        }


        System.out.println("/--------------------3--------------------/");
        //3.Lambda表达式
        //forEach方法的底层其实就是一个循环遍历，依次得到集合中的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s，依次表示集合中的每一个元素
        list.forEach(s->System.out.println(s) );


        System.out.println("/--------------------4--------------------/");
        //4.普通for循环
        //size方法跟get方法还有循环结合的方式，利用索引获取到集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            //i:依次表示集合中的每一个索引
            String s = list.get(i);
            System.out.println(s);
        }


        System.out.println("/--------------------5--------------------/");
        // 5.列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        //额外添加了一个方法：在遍历的过程中，可以添加元素
        ListIterator<String> it2 = list.listIterator();
        while(it2.hasNext()){
            String str = it2.next();
            if("bbb".equals(str)){
                //qqq
                it2.add("qqq");
                //这里不可以用集合的添加
                //list.add()会报错
            }
        }
        System.out.println(list);

//        void	add(E e)
//        将指定的元素插入列表（可选操作）。

//        boolean	hasNext()
//        如果此列表迭代器在向前遍历列表时具有更多元素，则返回 true 。

//        boolean	hasPrevious()
//        如果此列表迭代器在反向遍历列表时具有更多元素，则返回 true 。

//        E	next()
//        返回列表中的下一个元素并前进光标位置。

//        int	nextIndex()
//        返回后续调用 next()将返回的元素的索引。

//        E	previous()
//        返回列表 中的上一个元素并向后移动光标位置。

//        int	previousIndex()
//        返回后续调用 previous()将返回的元素的索引。

//        void	remove()
//        从列表中删除 next()或 previous() （可选操作）返回的最后一个元素。

//        void	set(E e)
//        用指定的元素替换 next()或 previous()返回的最后一个元素（可选操作）。

        // 五种遍历方式的适用场景总结
        // 1. 迭代器遍历：遍历过程中需要删除元素时使用
        // 2. 列表迭代器遍历：遍历过程中需要添加元素时使用
        // 3. 增强for遍历：仅需遍历集合，无需增删或操作索引时使用
        // 4. Lambda表达式遍历：仅需遍历集合，无需增删或操作索引时使用
        // 5. 普通for遍历：遍历过程中需要操作索引时使用
    }
}
