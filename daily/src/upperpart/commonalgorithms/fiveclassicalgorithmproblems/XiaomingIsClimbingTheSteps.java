package upperpart.commonalgorithms.fiveclassicalgorithmproblems;

import java.util.Scanner;

public class XiaomingIsClimbingTheSteps {
    static void main(String[] args) {
        /*
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢？

        运算结果参考：
        1层台阶：1种爬法
        2层台阶：2种爬法
        7层台阶：21种爬法
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入台阶数");
        int num = sc.nextInt();
        System.out.println(numberOfMoves(num));
    }

    public static int numberOfMoves(int n){
        //到第n级台阶的爬法数 = 到第n-1级台阶的爬法数+到第n-2级台阶的爬法数
        if(n == 1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        else
            return numberOfMoves(n-1)+numberOfMoves(n-2);
    }
}
