package upperpart.BasicKnowledg.deepseakprectice.array;

import java.util.Scanner;

public class StudentStatisticsSystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int n = sc.nextInt();
        int []score = new int[n];
        System.out.println("请输入成绩");
        for (int i = 0; i < n; i++) {
            score[i]  = sc.nextInt();
        }
        double avg = calculateAverage(score,n);
        System.out.println("平均数是"+avg);
        int max = searchMax(score,n);
        System.out.println("最大值是"+max);
        int min = searchMin(score,n);
        System.out.println("最小值是"+min);

    }

    public static double calculateAverage(int []score,int n){
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum +=score[i];
        }
        double avg = sum/n;
        return avg;
    }

    public static int searchMax(int score[] , int n){
        int max = score[0];
        for (int i = 1; i < n; i++) {
            if(max<score[i]){
                max = score[i];
            }
        }
        return max;
    }
    public static int searchMin(int score[] , int n){
        int min = score[0];
        for (int i = 1; i < n; i++) {
            if(min>score[i]){
                min = score[i];
            }
        }
        return min;
    }
}

