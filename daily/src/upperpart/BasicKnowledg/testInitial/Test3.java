package upperpart.BasicKnowledg.testInitial;

import java.util.Scanner;

public class Test3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        boolean result = number1 == 6||number2 == 6||((number1 + number2) % 6 == 0);
        System.out.println(result);
    }
}
