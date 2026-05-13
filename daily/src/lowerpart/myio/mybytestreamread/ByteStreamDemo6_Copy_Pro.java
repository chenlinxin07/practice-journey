package lowerpart.myio.mybytestreamread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6_Copy_Pro {
    static void main(String[] args) throws IOException {
        /*
         *   练习：
         *       文件拷贝
         *       把E:\chenlinxin\TestTool.jpg (635 KB) 拷贝到当前模块下。
         *
         * */


        long start = System.currentTimeMillis();

        //1.创建对象
        FileInputStream fis = new FileInputStream("E:\\chenlinxin\\TestTool.jpg");
        FileOutputStream fos = new FileOutputStream("daily/src/lowerpart/myio/copy.jpg");
        //2.拷贝
        int len;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        //3.释放资源
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);


    }

}
