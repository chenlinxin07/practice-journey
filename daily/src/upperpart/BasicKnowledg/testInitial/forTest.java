package upperpart.BasicKnowledg.testInitial;

import java.util.Scanner;

public class forTest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要重连多少次");
        int max = sc.nextInt();
        for (int i = 1; i<=max ; i++){
            System.out.println("第"+i+"次断线重连");
        }
    }
}
