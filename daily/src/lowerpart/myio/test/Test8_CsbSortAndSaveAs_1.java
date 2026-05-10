package lowerpart.myio.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test8_CsbSortAndSaveAs_1 {
    static void main(String[] args) throws IOException {
        /*
            需求：把《出师表》的文章顺序进行恢复到一个新文件中。
        */
        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("daily/src/lowerpart/myio/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("daily/src/lowerpart/myio/copycsb.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null){
            list.add(line);
        }

        //排序
        Collections.sort(list, (String o1, String o2)-> {
                //获取o1.o2
//                String[]s1 =  o1.split("\\.");
//                String[]s2 =  o2.split("\\.");
//                int n1 = Integer.parseInt(s1[0]);
//                int n2 = Integer.parseInt(s2[0]);
//                return n1-n2;
            int i1 = Integer.parseInt(o1.split("\\.")[0]);
            int i2 = Integer.parseInt(o2.split("\\.")[0]);
            return i1 - i2;
        });


        //写入
        int index = 0;
        int size = list.size();
        for (String s : list) {
            bw.write(s);
            // 判断：不是最后一个就换行
            if (index != size - 1) {
                bw.newLine();
            }

            index++; // 每次+1
        }
        bw.close();
        br.close();
    }
}
