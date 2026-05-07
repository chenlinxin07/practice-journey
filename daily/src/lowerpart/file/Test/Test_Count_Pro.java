package lowerpart.file.Test;

import java.io.File;
import java.util.HashMap;

public class  Test_Count_Pro {
    static void main(String[] args) {
        // 1. 只创建一个集合，全程共用这一个
        HashMap<String, Integer> hm = new HashMap<>();
        File file = new File("E:\\chenlinxin");

        // 调用静态方法：把文件夹 + 空集合传进去
        getCount(file, hm);

        // 按格式打印
        for (String key : hm.keySet()) {
            System.out.println(key + ":" + hm.get(key) + "个");
        }
    }

    // 改成：静态void方法，参数传 文件夹 + 共用的map
    public static void getCount(File src, HashMap<String,Integer> hm){
        File[] files = src.listFiles();
        // 防止空指针报错
        if(files == null){
            return;
        }

        // 遍历当前文件夹所有内容
        for (File file : files) {
            if(file.isFile()){
                // 完全保留你原来截取后缀的代码，一点没改
                String name = file.getName();
                String[] arr = name.split("\\.");
                if(arr.length >= 2){
                    String endName = arr[arr.length - 1];
                    // 计数逻辑也保留阿伟的写法
                    if(hm.containsKey(endName)){
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName,count);
                    }else{
                        hm.put(endName,1);
                    }
                }
            }else{
                // 是子文件夹 → 直接递归，传同一个map进去
                // 不用返回map、不用遍历合并！嵌套直接少一大层
                getCount(file, hm);
            }
        }
    }
}