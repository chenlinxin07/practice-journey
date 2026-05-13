package lowerpart.myio.test;

import java.io.*;

public class Test6_FourWaysOfCopy_byte {
    static void main(String[] args) {
        /*
            四种方式拷贝文件，并统计各自用时
            1. 字节基本流：一次一个字节
            2. 字节基本流：一次一个字节数组
            3. 字节缓冲流：一次一个字节
            4. 字节缓冲流：一次一个字节数组
        */

        // 循环执行4种方法，i对应 1/2/3/4 种复制方式
        for (int i = 1; i <= 4; i++) {
            System.out.println("===== 第" + i + "种复制方式 =====");
            long start = System.currentTimeMillis(); // 开始计时

            try {
                // 核心：根据i的值，调用对应的方法
                switch (i) {
                    case 1 -> method1();
                    case 2 -> method2();
                    case 3 -> method3();
                    case 4 -> method4();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            long end = System.currentTimeMillis(); // 结束计时
            System.out.println("耗时：" + (end - start)  + "毫秒\n");
        }
    }

    // 第一种：字节基本流 + 单个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("E:/Program Files/vs2026/Common7/IDE/CommonExtensions/Platform/WhatsNew/Content/media/agentic-issue-to-resolution.mp4");
        FileOutputStream fos = new FileOutputStream("daily/src/lowerpart/myio/copy.mp4");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    // 第二种：字节基本流 + 字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("E:/Program Files/vs2026/Common7/IDE/CommonExtensions/Platform/WhatsNew/Content/media/agentic-issue-to-resolution.mp4");
        FileOutputStream fos = new FileOutputStream("daily/src/lowerpart/myio/copy.mp4");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }

    // 第三种：字节缓冲流 + 单个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/Program Files/vs2026/Common7/IDE/CommonExtensions/Platform/WhatsNew/Content/media/agentic-issue-to-resolution.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("daily/src/lowerpart/myio/copy.mp4"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }

    // 第四种：字节缓冲流 + 字节数组（效率最高）
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/Program Files/vs2026/Common7/IDE/CommonExtensions/Platform/WhatsNew/Content/media/agentic-issue-to-resolution.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("daily/src/lowerpart/myio/copy.mp4"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }

//    ===== 第1种复制方式 =====
//    耗时：78868毫秒
//
//    ===== 第2种复制方式 =====
//    耗时：116毫秒
//
//    ===== 第3种复制方式 =====
//    耗时：751毫秒
//
//    ===== 第4种复制方式 =====
//    耗时：32毫秒
}