package lowerpart.file.Test;

import java.io.File;

public class Test5_FolderSize {
    static void main(String[] args) {
        /*需求：
            统计一个文件夹的总大小
        */

        File file = new File("E:\\chenlinxin");

        System.out.println(getLen(file));
    }



    /*
     * 作用：
     *       统计一个文件夹的总大小
     * 参数：
     *       表示要统计的那个文件夹
     * 返回值：
     *       统计之后的结果
     *
     * 文件夹的总大小：
     *       说白了，文件夹里面所有文件的大小
     * */
    public static long getLen(File file){
        long len = 0;
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){
                len += f.length();
            }
            else{
                len += getLen(f);
            }
        }
        return len;
    }
}
