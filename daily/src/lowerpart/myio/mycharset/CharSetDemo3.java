package lowerpart.myio.mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo3 {
    static void main(String[] args) throws UnsupportedEncodingException {
       /*
       Java中编码的方法
            public byte[] getBytes()                        使用默认方式进行编码
            public byte[] getBytes(String charsetName)      使用指定方式进行编码

        Java中解码的方法
            String(byte[] bytes)                            使用默认方式进行解码
            String(byte[] bytes, String charsetName)        使用指定方式进行解码
        */


        //1.编码
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes();//默认union
        System.out.println(Arrays.toString(bytes1));//长度为8,英文一个字节,中文三个字节

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));//长度为6,英文一个字节,中文两个字节


        //2.解码
        String str2 = new String(bytes1);
        System.out.println(str2);

        String str3 = new String(bytes2,"GBK");
        System.out.println(str3);

    }
}
