package upperpart.AdvancedObjectOrientedProgramming.StaticStudy;

import java.util.Scanner;

public class PhoneTest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phone.size = 6;

        Phone p1 = new Phone("vivo",2999);
//        p1.show();
        System.out.println(p1);
        p1.call();
        System.out.println("请输入游戏名称");
        p1.playGame(sc.next());
        p1.sendMessage();
    }
}
