package upperpart.BasicKnowledg.testInitial;

import java.util.Scanner;

public class Test5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        System.out.println(max);
    }
}
