package lowerpart.myio.mycharset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharSetDemo2 {
    static void main(String[] args) throws IOException {
        //1.创建对象
        FileInputStream fis = new FileInputStream("daily/src/lowerpart/myio/a.txt");
        FileOutputStream fos = new FileOutputStream("daily/src/lowerpart/myio/copy.txt");
        //2.拷贝
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }
        //3.释放资源
        fos.close();
        fis.close();
    }
}
