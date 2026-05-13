package upperpart.BasicKnowledg.testInitial;

import java.util.Scanner;

public class whileTest2 {
    static void main(String[] args) {
        //判断回文数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), num = 0;
        int temp = n;
        while (temp != 0) {
            int ge = temp % 10;
            temp /= 10;
            num = num * 10 + ge;
        }
        if (num == n)
            System.out.println("TURE");
        else
            System.out.println("FALSE");
    }
}
