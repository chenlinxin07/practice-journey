package upperpart.StringDemo.StringBuilder;

public class StringBuilderDemo2 {
    static void main(String[] args) {
        //链式编程
        //创建字符串
        StringBuilder sb = new StringBuilder();
        //添加
        sb.append("aaaa").append("bbbb").append("vvvv").append("dddd");
        //变成字符串
        String Str = sb.toString();
        System.out.println(Str);
    }
}
