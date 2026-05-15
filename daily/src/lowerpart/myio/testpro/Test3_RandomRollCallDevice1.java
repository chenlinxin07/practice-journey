package lowerpart.myio.testpro;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3_RandomRollCallDevice1 {
    static void main(String[] args) throws IOException {
        /*需求：
            需求：
                有一个文件里面存储了班级同学的信息，每一个信息占一行。
                格式为：张三-男-23
                要求通过程序实现随机点名器。

            运行效果：
                第一次运行程序：随机同学姓名1（只显示名字）
                第二次运行程序：随机同学姓名2（只显示名字）
                第三次运行程序：随机同学姓名3（只显示名字）
                …
         */
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("daily/src/lowerpart/myio/names.txt"));
        String line;
        while((line =br.readLine()) != null){
            list.add(line);
        }

        //解法一
        Random r = new Random();
        int index = r.nextInt(0,list.size());
        String[] arr = list.get(index).split("-");
        System.out.println(arr[0]);

        //解法二
        Collections.shuffle(list);
        String random2 = list.get(1);
        String[] arr2 = random2.split("-");
        System.out.println(arr2[0]);
    }
}
