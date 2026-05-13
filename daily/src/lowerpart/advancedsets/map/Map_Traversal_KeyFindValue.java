package lowerpart.advancedsets.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Traversal_KeyFindValue {
    static void main(String[] args) {
        //Map集合的第一种遍历方式

        //三个课堂练习：
        //
        //练习一：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历


        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("花子君","八寻宁宁");
        map.put("裴擒虎","公孙离");
        map.put("李信","公孙离");

        //3.通过键找值
        //3.1获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();

        //课堂实例or练习一
        //3.2遍历单列集合，得到每一个键
        for (String key : keys) {
            //System.out.println(key);
            //3.3 利用map集合中的键获取对应的值  get
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        //练习二,迭代器
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println("["+key+","+map.get(key)+"]");
        }

        //练习三,lamda表达式
        keys.forEach( s-> System.out.println(s+","+map.get(s)));
    }
}
