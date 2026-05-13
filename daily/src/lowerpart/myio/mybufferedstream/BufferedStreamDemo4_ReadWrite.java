package lowerpart.myio.mybufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4_ReadWrite {
    static void main(String[] args) throws IOException {
        /*
         *
         *    字符缓冲输出流
         *      构造方法：
         *           public BufferedWriter(Writer r)
         *      特有方法：
         *           public void newLine()      跨平台的换行
         *
         * */

        //1.创建字符缓冲输出流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("daily/src/lowerpart/myio/b.txt"));
        //2.写出数据
        bw.write("只要眼里有光，黑夜，就永远不会降临。");
        bw.newLine();
        bw.write("行天壤兮赴天渊，呈灵草兮济百年");
        bw.close();
    }
}
