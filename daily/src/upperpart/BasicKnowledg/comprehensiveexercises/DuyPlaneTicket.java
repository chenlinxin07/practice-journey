package upperpart.BasicKnowledg.comprehensiveexercises;

import java.util.Scanner;

public class DuyPlaneTicket {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要旅游的月份,机票原价");
        int mouth = sc.nextInt(), ticket = sc.nextInt();
        System.out.println("头等舱选1,经济舱选2");
        int seat = sc.nextInt();
        double price = 0.0;
        //头等舱
        if (seat == 1) {
            //旺季
            if (mouth >= 5 && mouth <= 10) {
                price = ticket * 0.9;
            }
            //淡季
            else if (mouth <= 5 || mouth >= 10 && mouth > 0 && mouth <= 12) {
                price = ticket * 0.85;
            } else System.out.println("月份不合法");
        }
        //经济舱
        else if (seat == 2) {
            //旺季
            if (mouth >= 5 && mouth <= 10) {
                price = ticket * 0.7;
            }
            //淡季
            else if (mouth <= 5 && mouth >= 10) {
                price = ticket * 0.65;
            } else System.out.println("月份不合法");
        } else System.out.println("只能选1或2无其他选项");
        System.out.println("机票价格为" + price);
    }
}
