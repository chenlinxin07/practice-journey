package lowerpart.myio.testpro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test12_Properties3 {
    static void main(String[] args) throws IOException {
        //1.创建集合
        Properties prop = new Properties();
        //2.读取本地Properties文件里面的数据
        FileInputStream fis = new FileInputStream("daily/src/lowerpart/myio/testpro/a.properties");
        prop.load(fis);
        fis.close();

        //3.打印集合
        System.out.println(prop);
    }
}
