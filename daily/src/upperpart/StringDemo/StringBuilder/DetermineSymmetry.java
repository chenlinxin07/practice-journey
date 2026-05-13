
//键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
package upperpart.StringDemo.StringBuilder;

import java.util.Scanner;

public class DetermineSymmetry {
    static void main(String[] args) {
        //使用StringBuilder的场景：
        //1.字符串的拼接
        //2.字符串的反转

        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        StringBuilder sb = new StringBuilder(Str).reverse();
        String result = sb.toString();
        System.out.println(result);
        String s = sc.next();

        //比较字符串
        boolean flag = s.equalsIgnoreCase(result);
        System.out.println(flag);


    }
}
