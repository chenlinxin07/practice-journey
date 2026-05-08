package lowerpart.myio.bytestreamcharstreamtest;

import java.io.*;

public class Test1_CopyTheFolder {
    //拷贝一个文件夹，考虑子文件夹
    static void main(String[] args) throws IOException {
        //数据源
        File scr = new File("E:\\chenlinxin");
        //目的地
        File dest = new File("E:\\dest");

        //调用方法开始拷贝
        copy(scr,dest);
    }


    /*
     * 作用：拷贝文件夹
     * 参数一：数据源
     * 参数二：目的地
     *
     * */
    public static void copy(File scr,File dest) throws IOException {
        File[] files = scr.listFiles();

        if(files == null) return;

        for(File f : files){
            if(f.isFile()){
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream(new File(dest,f.getName()));
                int len ;
                byte[] bytes = new byte[1024*1024];
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }
            else{
                File newDestDir = new File(dest, f.getName());
                newDestDir.mkdirs(); // 创建多级目录（不存在则创建）
                copy(f, newDestDir);
            }
        }
    }
}
