package lowerpart.myio.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test9_CsbSortAndSaveAs_2 {
    static void main(String[] args) throws IOException {
                /*
            需求：把《出师表》的文章顺序进行恢复到一个新文件中。
        */
        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("daily/src/lowerpart/myio/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("daily/src/lowerpart/myio/copycsb.txt"));
        TreeMap<Integer,String> tm = new TreeMap<>();
        String line;

        //treemap可以自动排序
        while((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),line);
        }

        //写入
        Set<Map.Entry<Integer,String>> entries = tm.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
