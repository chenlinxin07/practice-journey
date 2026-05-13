package upperpart.ObjectOrientedBeginner.ObjectArrayTwo;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        //键盘录入
        /*
        第一套体系:
        nextInt();接收整数
        nextDouble()接收小数;
        next();接收字符串;
        遇到空格,制表符,回车等就停止接收,后面的数据不接受;
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.next();
        System.out.println(a + "," + b + "," + c);
    }
}
