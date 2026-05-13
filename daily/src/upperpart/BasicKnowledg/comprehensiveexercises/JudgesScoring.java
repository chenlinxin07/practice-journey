package upperpart.BasicKnowledg.comprehensiveexercises;

import java.util.Random;
import java.util.Scanner;

public class JudgesScoring {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评委个数");
        int numjudge = sc.nextInt();
        int[] score = new int[numjudge];
        Random r = new Random();
        for (int i = 0; i < numjudge; i++) {
            score[i] = r.nextInt(0, 100);
        }
        for (int i = 0; i < numjudge; i++) {
            for (int j = i+1; j < numjudge ; j++) {
                if (score[i] > score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
            System.out.print(score[i] + " ");
        }
        System.out.println();
        //冒泡排序
//        for (int i = 0; i < numjudge - 1; i++) {
//            for (int j = 0; j < numjudge - 1 - i; j++) {
//                if (score[j] > score[j + 1]) {
//                    int temp = score[j];
//                    score[j] = score[j + 1];
//                    score[j + 1] = temp;
//                }
//            }
//        }
        double sum = 0.0;
        for (int i = 1; i < numjudge-1; i++) {
            sum +=score[i];
        }
        System.out.println("该选手成绩为" + sum/(numjudge-2));
    }
}
