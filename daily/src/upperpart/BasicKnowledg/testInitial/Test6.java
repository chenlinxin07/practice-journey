package upperpart.BasicKnowledg.testInitial;

import java.util.Scanner;

public class Test6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 42:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            default:
                System.out.println("休息,不锻炼了");
        }
    }
}
