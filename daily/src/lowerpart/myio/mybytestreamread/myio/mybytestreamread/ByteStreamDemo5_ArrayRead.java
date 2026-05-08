package lowerpart.myio.mybytestreamread.myio.mybytestreamread;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5_ArrayRead {
//    static void main(String[] args) throws IOException {
//        long start = System.currentTimeMillis();
//
//        FileInputStream fis = new FileInputStream("E:\\chenlinxin\\TestTool.jpg");
//        FileOutputStream fos = new FileOutputStream("daily/src/lowerpart/myio/copy.jpg");
//
//        int len ;
//        byte[] bytes = new byte[1024];
//        while(len = (fis.read(bytes) != -1)){
//            fos.write(bytes,0,len);
//        }
//    }

    static void main(String[] args) throws IOException {
      /*
          public int read(byte[] buffer)      一次读一个字节数组数据
      */


        //1.创建对象
        FileInputStream fis = new FileInputStream("daily/src/lowerpart/myio/a.txt");
        //2.读取数据
        byte[] bytes = new byte[10];
        //一次读取多个字节数据，具体读多少，跟数组的长度有关
        //返回值：本次读取到了多少个字节数据
        int len1 = fis.read(bytes);
        System.out.println(len1);//10
        String str1 = new String(bytes,0,len1);
        System.out.println(str1);


        int len2 = fis.read(bytes);
        System.out.println(len2);//10
        String str2 = new String(bytes,0,len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        System.out.println(len3);//5
        String str3 = new String(bytes,0,len3);
        System.out.println(str3);// 结尾了



        //3.释放资源
        fis.close();


    }
}
