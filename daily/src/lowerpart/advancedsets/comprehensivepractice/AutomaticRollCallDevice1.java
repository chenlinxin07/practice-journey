package lowerpart.advancedsets.comprehensivepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AutomaticRollCallDevice1 {
     /* 班级里有N个学生，学生属性:姓名，年龄，性别。
        实现随机点名器。*/
     static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();

         //第一种方法
         Random r = new Random();
         Collections.addAll(list,"范闲","范建","范统","杜子腾",
                 "杜琦燕","宋合泛","侯笼藤","朱益群","朱穆朗玛峰","袁明媛");
         int xinyun = r.nextInt(list.size());
         System.out.println(list.get(xinyun));

         //第二种方法
         Collections.shuffle(list);
         System.out.println(list.get(0));
     }
}
