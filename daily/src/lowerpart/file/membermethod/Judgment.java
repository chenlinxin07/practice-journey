package lowerpart.file.membermethod;

import java.io.File;

public class Judgment {
    static void main(String[] args) {
     /*
        public boolean isDirectory()        判断此路径名表示的File是否为文件夹
        public boolean isFile()             判断此路径名表示的File是否为文件
        public boolean exists()             判断此路径名表示的File是否存在

     */

        //1.对一个文件的路径进行判断
        System.out.println("============ 1 =================");
        File f1 = new File("E:\\chenlinxin\\helloworld.txt");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//true
        System.out.println(f1.exists());//true

        //2.对一个文件夹的路径进行判断
        System.out.println("============ 2 =================");
        File f2 = new File("E:\\chenlinxin\\ex1");
        System.out.println(f2.isDirectory());//true
        System.out.println(f2.isFile());//false
        System.out.println(f2.exists());//true

        //3.对一个不存在的路径进行判断
        System.out.println("============ 3 =================");
        File f3 = new File("E:\\chenlinxin\\xixi.txt");
        System.out.println(f3.isDirectory());//false
        System.out.println(f3.isFile());//false
        System.out.println(f3.exists());//false

    }
}
