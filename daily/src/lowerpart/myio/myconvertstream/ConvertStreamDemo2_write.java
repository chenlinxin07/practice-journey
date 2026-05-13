package lowerpart.myio.myconvertstream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2_write {
    static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码写出
        */

        /*
        //1.创建转换流的对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("daily/src/lowerpart/myio/c.txt"),"GBK");
        //2.写出数据
        osw.write("你好你好");
        //3.释放资源
        osw.close();*/


        FileWriter fw = new FileWriter("daily/src/lowerpart/myio/gbk.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();
    }
}
