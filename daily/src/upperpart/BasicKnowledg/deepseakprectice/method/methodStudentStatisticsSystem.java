package upperpart.BasicKnowledg.deepseakprectice.method;

import java.util.Arrays;
import java.util.Scanner;

public class methodStudentStatisticsSystem {
    //主函数
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入学生个数");
        int num = sc.nextInt();
        int[] score = new int[num];
        inputScores(score, num, sc);
        printscore(score,num);
        System.out.println();
        double avg = calculateAverage(score,num);
        System.out.println("平均成绩为"+avg);
        int max = maxScore(score,num);
        System.out.println("最高分为"+max);
        int min = minScore(score,num);
        System.out.println("最低分为"+min);
        countFailOrPass(score,num);

    }

    //输入成绩
    static void inputScores(int[] score , int num , Scanner sc) {
        System.out.println("请输入学生成绩");
        for (int i = 0; i < num; i++) {
            score[i] = sc.nextInt();
        }
    }

    //求平均成绩
    static double calculateAverage(int []score , int num){
        double sum = 0.0;
        for (int i = 0; i < num; i++) {
            sum +=score[i];
        }
        return sum/num;
    }

    //返回最高分
    static int maxScore(int[] score,int num){
        int max = score[0];
        for (int i = 1; i < num; i++) {
            if(max<score[i]){
                max=score[i];
            }
        }
        return max;
    }
    //返回最低分
    static int minScore(int[] score,int num){
        int min = score[0];
        for (int i = 1; i < num; i++) {
            if(min>score[i]){
                min=score[i];
            }
        }
        return min;
    }

    //统计各分段人数并打印
    static void countFailOrPass(int[]score , int num){
        int fail = 0,pass = 0;
        for (int i = 0; i < num; i++) {
            if(score[i]>59&&score[i]<101){
                pass ++;
            }
            else if(score[i]<60&&score[i]>0){
                fail++;
            }
            else{
                System.out.println(score[i]+"不是合理分数");
            }
        }
        System.out.println("合格人数为"+pass);
        System.out.println("不合格人数为"+fail);
    }

    //打印所有成绩
    static void printscore(int[] score,int num){
        for (int i = 0; i < num; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println(Arrays.toString(score));

    }
}
