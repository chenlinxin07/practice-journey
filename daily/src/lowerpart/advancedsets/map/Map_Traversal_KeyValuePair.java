package lowerpart.advancedsets.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Traversal_KeyValuePair {
    static void main(String[] args) {
        //Map集合的第二种遍历方式

        //三个课堂练习：
        //
        //练习一：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
        //练习二：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
        //练习三：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用lambda的形式进行遍历

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        //键：人物的外号
        //值：人物的名字
        map.put("最强水柱","富冈义勇");
        map.put("顶级辅助","桑启");
        map.put("超级大鸡","李可昕");

        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1 通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();


        //3.2 遍历entries这个集合，去得到里面的每一个键值对对象,也是实验一
        for (Map.Entry<String, String> entry : entries) {//entry  --->;  "超级大鸡","李可昕"
            //3.3 利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        //练习二,迭代器
        Iterator it = entries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //练习三,lamda表达式
        entries.forEach(stringStringEntry->
                System.out.println(stringStringEntry));

    }
}
