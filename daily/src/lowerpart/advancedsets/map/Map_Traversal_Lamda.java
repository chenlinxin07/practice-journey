package lowerpart.advancedsets.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Map_Traversal_Lamda {
    static void main(String[] args) {
        //Map集合的第三种遍历方式


        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        //键：人物的名字
        //值：名人名言
        map.put("安琪拉","火烧屁屁了");
        map.put("桑启","寸草纤纤,连理成荫");
        map.put("怪盗基德","show time");
        map.put("柯南","真相只有一个");

        //3.利用lambda表达式进行遍历
        //底层：
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        System.out.println("-----------------------------------");

        map.forEach((String key, String value)->{
            System.out.println(key + "=" + value);
        }
        );

        System.out.println("-----------------------------------");

        map.forEach((key, value)->
                System.out.println(key + "=" + value));


    }
}
