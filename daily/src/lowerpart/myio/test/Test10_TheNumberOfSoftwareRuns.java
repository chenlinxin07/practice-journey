package lowerpart.myio.test;

import java.io.*;

public class Test10_TheNumberOfSoftwareRuns {
    static void main(String[] args) throws IOException {
        /*
        实现一个验证程序运行次数的小程序，要求如下：
        1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
        2.程序运行演示如下:
        第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
        第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
        第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
        第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
        */

        //1.把文件中的数字读取到内存中
        //原则：
        //IO：随用随创建
        //    什么时候不用什么时候关闭
        BufferedReader br = new BufferedReader(new FileReader("daily/src/lowerpart/myio/count.txt"));
        int count = Integer.parseInt(br.readLine());
        count++;

        //2.判断输出
        if(count<=3){
            System.out.println("欢迎使用本软件,第"+count+"次使用免费~");
        }else{
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        }
        br.close();

        //3.写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("daily/src/lowerpart/myio/count.txt"));
        bw.write(count+"");
        bw.close();
    }
}
