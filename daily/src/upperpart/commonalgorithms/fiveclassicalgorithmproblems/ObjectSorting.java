package upperpart.commonalgorithms.fiveclassicalgorithmproblems;

import java.util.Arrays;
import java.util.Comparator;

public class ObjectSorting {
    /*
     * ========== 完整题目要求 ==========
     * 定义数组并存储一些男朋友对象，利用Arrays中的sort方法进行排序
     * 要求1：男朋友对象的属性有姓名、年龄、身高（姓名中不要有中文或特殊字符）
     * 要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
     */
    static void main(String[] args) {
        //创建男朋友的对象
        BoyFriend bf1 = new BoyFriend("huazijun",18,166);
        BoyFriend bf2 = new BoyFriend("shangqi",666,165);
        BoyFriend bf3 = new BoyFriend("shenzi",18,188);
        //存到数组里
        BoyFriend[] arr = {bf1,bf2,bf3};
        //排序(匿名内部类)
        Arrays.sort(arr, new Comparator<BoyFriend>() {
            @Override
            public int compare(BoyFriend o1, BoyFriend o2) {
                if(o1.getAge()!=o2.getAge())
                    return o1.getAge()-o2.getAge();
                if(o1.getHeight()!=o2.getHeight())
                    return Double.compare(o1.getHeight(), o2.getHeight());

                return o1.getName().compareTo(o2.getName());
            }
        });


        BoyFriend[] arr2 = {bf1,bf2,bf3};
        //排序(lamda)
        Arrays.sort(arr2,(o1,o2)->{
            if(o1.getAge()!=o2.getAge())
                return o1.getAge()-o2.getAge();
            if(o1.getHeight()!=o2.getHeight())
                return Double.compare(o1.getHeight(), o2.getHeight());

            return o1.getName().compareTo(o2.getName());
        });
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr));
    }
}
