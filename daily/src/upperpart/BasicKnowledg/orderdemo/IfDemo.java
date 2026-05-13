package upperpart.BasicKnowledg.orderdemo;

import java.util.Scanner;

public class IfDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine=sc.nextInt();
        if(wine>2) {
            System.out.println("你真棒");
        }


//        int num=10;
//        if(num>10)
//            int c=10;//包括两步,第一步,定义变量,第二步,给c变量赋值为100

        boolean flag =false;
        //如果是对布尔类型的变量进行判断不要用==,直接把变量名写在小括号
        if(!flag){
            System.out.println("flag的值为false");
        }
       }
}
