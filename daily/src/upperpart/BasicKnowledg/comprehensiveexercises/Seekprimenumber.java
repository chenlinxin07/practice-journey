package upperpart.BasicKnowledg.comprehensiveexercises;

import java.util.Scanner;

public class Seekprimenumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数据和结束数据");
        int from = sc.nextInt(),to = sc.nextInt();
        boolean sign = true;
        int num = 0;
        for (int i = from; i <= to; i++) {
            for (int j = 2; j*j <= i; j++) {
                sign = true;
                if(i%j==0) {
                    sign = false;
                    break;
                }
            }
            if(sign) {
                System.out.println(i+"为质数");
                num++;
            }

        }
        System.out.println("一共有"+num+"个质数");
    }
}
