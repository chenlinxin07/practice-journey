package upperpart.BasicKnowledg.testInitial;

import java.util.Scanner;

public class fortest4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入求值范围");
        int start = sc.nextInt(), end = sc.nextInt();
        for(int i=start;i<=end;i++){
            if(i%3==0&&i%5==0){
                System.out.println(i);
            }
        }

    }
}
