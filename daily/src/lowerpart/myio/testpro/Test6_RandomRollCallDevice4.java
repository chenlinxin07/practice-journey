package lowerpart.myio.testpro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test6_RandomRollCallDevice4 {
    static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。

          运行结果要求：
            被点到的学生不会再被点到。
            但是如果班级中所有的学生都点完了， 需要重新开启第二轮点名。

          核心思想：
               点一个删一个，把删除的备份，全部点完时还原数据。

        */
        BufferedReader br = new BufferedReader(new FileReader("daily/src/lowerpart/myio/names.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null){
            String[] arr = line.split("-");
            list.add(arr[0]);
        }

        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int sumcount = 0;
        int count = 0;
        for (int i = 0; i < time; ) {
            ArrayList<String> list1 = new ArrayList<>(list);
            Collections.shuffle(list1);
            System.out.println(list1.getFirst());
            list1.remove(0);
            count++;
            sumcount++;
            if(count > list1.size()){
                count = 0;
                i++;
                continue;
            }
        }
        System.out.println(sumcount);
    }
}
