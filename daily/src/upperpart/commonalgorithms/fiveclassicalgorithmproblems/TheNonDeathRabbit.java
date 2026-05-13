package upperpart.commonalgorithms.fiveclassicalgorithmproblems;

import java.util.Scanner;

public class TheNonDeathRabbit {
    static void main(String[] args) {
        /*
        有一个很有名的数学逻辑题叫做不死神兔问题。
        有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少？

        1月：1
        2月：1
        3月：2
        4月：3
        5月：5
        6月：8

        特点：从第三个数据开始，是前两个数据和（斐波那契数列）
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要求的月份");
        int times = sc.nextInt();
        System.out.println(fab(times));
    }

    public static int fab(int n){
        if(n==1||n==2){
            return 1;
        }
        else{
            return fab(n-1)+fab(n-2);
        }
    }
}
