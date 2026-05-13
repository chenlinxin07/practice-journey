package upperpart.BasicKnowledg.comprehensiveexercises;

import java.util.Scanner;

public class CopyArray {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组元素个数");
        int num = sc.nextInt();
        int []arr = new int [num];
        System.out.println("请输入数组内容");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.print("这是数组一");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("这是数组二");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

}
