package upperpart.api;

import java.util.Scanner;

public class Realize_ToBinaryString {
    static void main(String[] args) {
        /*
            定义一个方法自己实现toBinaryString方法的效果，
            将一个十进制整数转成字符串表示的二进制
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        int temp = n;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int m = n%2;
            sb.insert(0,m);
            n = n/2;
        }
        String result = sb.toString();
        System.out.println(result);
        String a = Integer.toBinaryString(temp);
        System.out.println(a);
    }
}
