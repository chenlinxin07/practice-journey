package upperpart.api;

import java.util.Scanner;

public class Realized_ParseInt {
    static void main(String[] args) {
        /*
            自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
            字符串中只能是数字不能有其他字符,最少一位，最多10位,0不能开头
        */
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(result==0) {
            String s = sc.nextLine();
            if(!s.matches("[1-9]\\d{0,9}")){
                System.out.println("格式不合法");
            }
            else{
                for (int i = 0; i < s.length(); i++) {
                    result = result*10 + (s.charAt(i)-'0');
                }
            }
        }
        System.out.println(result);
    }
}
