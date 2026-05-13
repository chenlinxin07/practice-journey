package upperpart.BasicKnowledg.testInitial;

import java.util.Scanner;

public class forTest2 {
    static void main(String[] args) {
        //求阶乘
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要求的阶乘");
        int max = sc.nextInt(), outcome = 1;
        for (int i = 1; i <= max; i++) {
            outcome *= i;
        }
        System.out.println(outcome);
    }
}
