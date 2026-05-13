package upperpart.BasicKnowledg.arraydemo;

import java.util.Random;
import java.util.Scanner;


public class FindMaxNumArray {
    static void main(String[] args) {
        //键盘输入
        Scanner sc= new Scanner(System.in);
        int []arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值是"+max);


        //随机输入
        //求平均值
        Random r = new Random();
        int []arr1 = new int[5];
        for (int i = 0; i < 5; i++) {
        arr1[i] = r.nextInt(1,101);
        System.out.println(arr1[i]);
        }
        int max1 = arr1[0],sum = 0;
        for (int i = 1; i < 5; i++) {
            if(max1<arr1[i]){
                max1 = arr1[i];
            }
        }
        System.out.println("最大值是"+max1);
        for (int i = 0; i < 5; i++) {
            sum +=arr1[i];
        }
        double ave = sum/5.0;
        System.out.println("二的平均数是"+ave);
    }
}
