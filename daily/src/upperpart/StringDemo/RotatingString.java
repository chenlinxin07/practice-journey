package upperpart.StringDemo;

import java.util.Scanner;

public class RotatingString {
    static void main(String[] args) {
        //旋转的意思是把字符串第一个字母调到最后一个位置
        //我现在要比较字符串a在旋转过程中有没有哪有哪一态是字符串b
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串a后换行或空格后输入字符串b");
        String a = sc.next();
        String b = sc.next();
        boolean flag =  judge(a, b);
        System.out.println(flag);


    }

    public static boolean judge(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if(b.equals(a)){
                return true;
            }
            a = rotate2(a);
        }
        return false;
    }

    //"旋转"字符串
    //方法一,截取字符串
    public static String rotate1(String a){
        String b = a.substring(1)+a.charAt(0);
        return b;
    }
    //方法二,将字符串转换为数组
    public static String rotate2(String a) {
        if (a == null || a.length() <= 1) {
            return a;
        }
        char[] c = a.toCharArray();
        char temp = c[0];
        for (int i = 0; i < c.length - 1; i++) {
            c[i] = c[i + 1];
        }
        c[c.length-1] = temp;
        a = new String(c);
        System.out.println(a);
        return a;
    }
}
