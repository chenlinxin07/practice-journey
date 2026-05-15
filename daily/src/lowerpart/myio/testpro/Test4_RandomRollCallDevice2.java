package lowerpart.myio.testpro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test4_RandomRollCallDevice2 {
    static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的信息，格式为：张三-男-23
            每一个学生信息占一行。
            要求通过程序实现随机点名器。
            70%的概率随机到男生
            30%的概率随机到女生
            随机100万次，统计结果。看生成男生和女生的比例是不是接近于7：3
        */

        //分别将男女名字加入集合
        ArrayList<String> girllist = new ArrayList<>();
        ArrayList<String> boylist = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("daily/src/lowerpart/myio/names.txt"));
        String line;
        while((line = br.readLine()) != null){
            String[] arr = line.split("-");
            if(arr[1].equals("男")){
                boylist.add(arr[0]);
            }else if(arr[1].equals("女")){
                girllist.add(arr[0]);
            }
        }
        br.close();

        //2.定义权重集合，男女比例：7:3
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);

        //开始点名
        int boyCount = 0;
        int girlCount = 0;
        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            int weight = list.get(r.nextInt(list.size()));
            if(weight == 1){
                //1就随机男生
                Collections.shuffle(boylist);
                String boyInfo = boylist.getFirst();
                System.out.println(boyInfo);
                boyCount++;
            }else{
                //0就随机女生
                Collections.shuffle(girllist);
                String girlInfo = girllist.getFirst();
                System.out.println(girlInfo);
                girlCount++;
            }
        }

        System.out.println("随机抽取100万次，其中男生被抽到了" + boyCount);
        System.out.println("随机抽取100万次，其中女生被抽到了" + girlCount);
    }
}
