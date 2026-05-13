package lowerpart.file.membermethod;

import java.io.File;

public class Delete {
    static void main(String[] args) {
      /*
        public boolean delete()             删除文件、空文件夹
        细节：
            如果删除的是文件，则直接删除，不走回收站。
            如果删除的是空文件夹，则直接删除，不走回收站
            如果删除的是有内容的文件夹，则删除失败
      */

        //1.创建File对象
        File f1 = new File("E:\\chenlinxin\\ggg");
        //2.删除
        boolean b = f1.delete();
        System.out.println(b);
    }
}
