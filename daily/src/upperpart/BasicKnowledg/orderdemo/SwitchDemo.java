package upperpart.BasicKnowledg.orderdemo;

import java.util.Scanner;

public class SwitchDemo {
    static void main(String[] args) {
        //switch 的新写法
        //这个和c语言一样,只有一条语句的时候可以省略大括号,但是不建议省,
        //即执行case后面跟随的语句(大括号内地语句),不会发生switch的贯穿
        //不需要写break
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 10;
        switch (number) {
            case 1 -> {
                System.out.println("一");
            }
            case 5 -> {
                System.out.println("五");
            }
            case 10 -> {
                System.out.println("十");
            }
        }
    }
}
