package lowerpart.advancedsets.comprehensivepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AutomaticRollCallDevice2 {
    /* 班级里有N个学生
        要求：
        70%的概率随机到男生
        30%的概率随机到女生

        "范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰",
        "杜琦燕","袁明媛","李猜","田蜜蜜",
    */
    static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,0,0,0};
        Random r = new Random();
        ArrayList<String> boylist = new ArrayList<>();
        ArrayList<String> girllist = new ArrayList<>();
        Collections.addAll(boylist,"范闲","范建","范统",
                "杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(girllist,"杜琦燕","袁明媛","李猜","田蜜蜜");
        if(arr[r.nextInt(arr.length)] == 1 )
            System.out.println(boylist.get(r.nextInt(boylist.size())));
        else if (arr[r.nextInt(arr.length)] == 0)
            System.out.println(girllist.get(r.nextInt(boylist.size())));
        else
            System.out.println("输出错误");
    }
}
