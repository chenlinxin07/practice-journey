package upperpart.advancedsets.generictype;

import java.util.ArrayList;

public class GenericsDemo_Method {

/*
    定义一个工具类：ListUtil
    类中定义一个静态方法addAll，用来添加多个集合的元素。
*/
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list1);


        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2,1,2,3,4);
        System.out.println(list2);



    /*
        可以让添加元素数量可变
        public static&lt;E&gt; void addAll2(ArrayList&lt;E&gt; list, E...e){
            for (E element : e) {
                list.add(element);
            }
        }*/

    }
}