package upperpart.BasicKnowledg.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("i");
        list.add("am");
        list.add("you");
        list.add("dad");

        System.out.println(list);

        //删除元素
        boolean s1 = list.remove("i");
        System.out.println(list+""+s1);
        boolean s2 = list.remove("yes");
        System.out.println(list+""+s2);

        //修改元素
        String s3 = list.set(0,"he");
        System.out.println(list+""+s3);

        //查询元素
        String s4 = list.get(0);
        System.out.println(s4);
    }
}
