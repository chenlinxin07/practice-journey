package lowerpart.myio.test;

import java.io.*;

public class Test7_FourWaysOfCopy_char {
    static void main(String[] args) {
        /*
            字符流 四种拷贝方式，统计用时
            1. 字符基本流：一次读写一个字符
            2. 字符基本流：一次读写一个字符数组
            3. 字符缓冲流：一次读写一个字符
            4. 字符缓冲流：一次读写一个字符数组
        */

        // 循环执行4种复制方式
        for (int i = 1; i <= 4; i++) {
            System.out.println("===== 字符流第" + i + "种复制方式 =====");
            long start = System.currentTimeMillis();

            // 调用对应复制方法
            try {
                switch (i) {
                    case 1 -> method1();
                    case 2 -> method2();
                    case 3 -> method3();
                    case 4 -> method4();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - start) + "毫秒\n");
        }
    }

    // 第一种：字符基本流 + 单个字符
    public static void method1() throws IOException {
        FileReader fr = new FileReader("E:/Program Files/vs2026/Common7/IDE/CommonExtensions/Platform/WhatsNew/Content/media/agentic-issue-to-resolution.mp4");
        FileWriter fw = new FileWriter("daily/src/lowerpart/myio/copy.mp4");
        int i;
        while((i = fr.read()) != -1){
            fw.write(i);
        }
        fw.close();
        fr.close();
    }

    // 第二种：字符基本流 + 字符数组
    public static void method2() throws IOException {
        FileReader fr = new FileReader("E:/Program Files/vs2026/Common7/IDE/CommonExtensions/Platform/WhatsNew/Content/media/agentic-issue-to-resolution.mp4");
        FileWriter fw = new FileWriter("daily/src/lowerpart/myio/copy.mp4");
        char[] chars = new char[1024];
        int len;
        while((len = fr.read(chars)) != -1){
            fw.write(chars,0,len);
        }
        fw.close();
        fr.close();
    }

    // 第三种：字符缓冲流 + 单个字符
    public static void method3() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:/Program Files/vs2026/Common7/IDE/CommonExtensions/Platform/WhatsNew/Content/media/agentic-issue-to-resolution.mp4"));
        BufferedWriter bw = new BufferedWriter( new FileWriter("daily/src/lowerpart/myio/copy.mp4"));
        int i;
        while((i = br.read()) != -1){
            bw.write(i);
        }
        bw.close();
        br.close();
    }

    // 第四种：字符缓冲流 + 字符数组（效率最高）
    public static void method4() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:/Program Files/vs2026/Common7/IDE/CommonExtensions/Platform/WhatsNew/Content/media/agentic-issue-to-resolution.mp4"));
        BufferedWriter bw = new BufferedWriter( new FileWriter("daily/src/lowerpart/myio/copy.mp4"));
        char[] chars = new char[1024];
        int len;
        while((len = br.read(chars)) != -1){
            bw.write(chars,0,len);
        }
        bw.close();
        br.close();
    }
//    ===== 字符流第1种复制方式 =====
//    耗时：1744毫秒
//
//    ===== 字符流第2种复制方式 =====
//    耗时：573毫秒
//
//    ===== 字符流第3种复制方式 =====
//    耗时：1228毫秒
//
//    ===== 字符流第4种复制方式 =====
//    耗时：555毫秒
}