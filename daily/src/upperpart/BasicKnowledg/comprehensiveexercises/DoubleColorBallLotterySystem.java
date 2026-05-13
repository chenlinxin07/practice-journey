package upperpart.BasicKnowledg.comprehensiveexercises;

import java.util.Random;
import java.util.Scanner;

public class DoubleColorBallLotterySystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        int []priceNum = new int[6];
        //生成中奖号码
        //红球
        createPriceNum(r, priceNum);
        //蓝球
         int blueNum = r.nextInt(1,14);
        //用户输入中奖号码并判断中奖球数
        int [] num = enterAndJudge(priceNum, sc, blueNum);
        //判断用户几等奖
        judgeGrade(num);

        printPriceNum(priceNum, blueNum);
    }

    private static void printPriceNum(int[] priceNum, int blueNum) {
        for (int i = 0; i < priceNum.length; i++) {
            System.out.print(priceNum[i] + " ");
            if(i == priceNum.length-1){
                System.out.println(blueNum);
            }
        }
    }

    private static void judgeGrade(int[] num) {
        //根据红球的个数以及蓝球的个数来判断中奖情况
        if(num[0] == 6 && num[1] == 1){
            System.out.println("恭喜你，中奖1000万");
        }else if(num[0] == 6 && num[1] == 0){
            System.out.println("恭喜你，中奖500万");
        }else if(num[0] == 5 && num[1] == 1){
            System.out.println("恭喜你，中奖3000");
        }else if((num[0] == 5 && num[1] == 0) || (num[0] == 4 && num[1] == 1)){
            System.out.println("恭喜你，中奖200");
        }else if((num[0] == 4 && num[1] == 0) || (num[0] == 3 && num[1] == 1)){
            System.out.println("恭喜你，中奖10");
        }else if((num[0] == 2 && num[1] == 1) || (num[0] == 1 && num[1] == 1)|| (num[0] == 0 && num[1] == 1)){
            System.out.println("恭喜你，中奖5");
        }else{
            System.out.println("谢谢参与");
        }
    }

    private static int[] enterAndJudge(int[] priceNum, Scanner sc, int blueNum) {
        //用户输入中奖号码并判断中奖球数
        //输入红球
        int redCount = 0,blueCount = 0;
        int []userNum = new int[priceNum.length+1];
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i+1) + "个号码");
            int temp = sc.nextInt();
            if(temp<0 || temp>34 || contains(userNum,temp)){
                System.out.println("输入红球号码不合理");
                continue;
            }
            else {
                userNum[i] = temp;
                i++;
                if(contains(priceNum,temp)){
                    redCount++;
                }
            }
        }
        //输入蓝球
        while (true){
            System.out.println("请输入蓝球号码");
            int temp = sc.nextInt();
            if(temp<=15 &&temp>0){
                userNum[6] = temp;
                if(blueNum == temp)
                {
                    blueCount++;
                }
                break;
            }
            else{
                System.out.println("输入蓝球号码不合理");
            }
        }
        int []num = {redCount,blueCount};
        return num;
    }

    private static void createPriceNum(Random r, int[] priceNum) {
        //生成中奖号码
        //红球
        for (int i = 0; i < 6; ) {
            int temp = r.nextInt(1,33);
            if(!contains(priceNum,temp)){
                priceNum[i] = temp;
                i++;
            }
        }
    }


    public static boolean contains(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
