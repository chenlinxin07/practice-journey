package lowerpart.myio.mybytestreamread.myio.mycharset;

import java.io.FileInputStream;
import java.io.IOException;

public class CharSetDemo1 {
    static void main(String[] args) throws IOException {
        /*
           字节流读取中文会出现乱码
        */
        FileInputStream fis = new FileInputStream("daily/src/lowerpart/myio/a.txt");
        int b;

        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        fis.close();
    }
}
