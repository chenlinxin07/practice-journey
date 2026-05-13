package lowerpart.streamflow.teat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stream_DataFiltering {
    static void main(String[] args) {
         /*
        定义一个集合，并添加一些整数  1,2,3,4,5,6,7,8,9,10
        过滤奇数，只留下偶数。
        并将结果保存起来
       */

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,2,3,4,5,6,7,8,9,10);
        //Integer[] arr = list.stream().filter(d -> d % 2 == 0).toList().toArray(new Integer[0]);
        //System.out.println(Arrays.toString(arr));

        List<Integer> newList = list.stream().filter(d->d%2==0).toList();
        System.out.println(newList);
    }
}
