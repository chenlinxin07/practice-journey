package upperpart.BasicKnowledg.testInitial;

import java.util.Scanner;

public class Test2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我自己的时髦度");
        int myFashion=sc.nextInt();
        System.out.println("请输入相亲对象的时髦度");
        int girlFashion = sc.nextInt();

        boolean result = myFashion > girlFashion;
        System.out.println(result);
        System .out.println(myFashion&girlFashion);
        System.out.println(myFashion|girlFashion);
    }
}
