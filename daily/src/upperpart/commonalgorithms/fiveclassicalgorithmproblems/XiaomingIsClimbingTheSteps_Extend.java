package upperpart.commonalgorithms.fiveclassicalgorithmproblems;

import java.util.Scanner;

public class XiaomingIsClimbingTheSteps_Extend {
    static void main(String[] args) {
        /*
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶，有的时候一次爬三个台阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢？
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入台阶数");
        int num = sc.nextInt();
        System.out.println(numberOfMoves(num));
    }

    public static int numberOfMoves(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 4;
        return numberOfMoves(n-1)+numberOfMoves(n-2)+numberOfMoves(n-3);
    }
}
