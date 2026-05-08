package lowerpart.myio.mybytestreamread.myio.mybytestreamwrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3_write {
    static void main(String[] args) throws IOException {
        /*
           void write(int b)                       一次写一个字节数据
           void write(byte[] b)                    一次写一个字节数组数据
           void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据
           参数一：
                数组
           参数二：
                起始索引  0
           参数三：
                个数      3
        */

        //2.创建对象
        FileOutputStream fos = new FileOutputStream("daily/src/lowerpart/myio/a.txt");
        //2.写出数据
        //fos.write(97); // a
        //fos.write(98); // b
        byte[] bytes = {97, 98, 99, 100, 101};

        //fos.write(bytes);     这里传整个数组

        //       从 1 开始写   写 2 个
        fos.write(bytes,1,2);// b c
        //3.释放资源
        fos.close();
    }
}
