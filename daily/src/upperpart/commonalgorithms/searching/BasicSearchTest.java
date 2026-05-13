package upperpart.commonalgorithms.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BasicSearchTest {
    static void main(String[] args) {
        //课堂练习2：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复的可能性
        //{131, 127, 147, 81, 103, 23, 7, 79, 81}
        //我要查找81，想要返回的是所有索引 3 8
        int []arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素");
        int n = sc.nextInt();
        //int []result = basicSearch(arr,n);
        System.out.println(Arrays.toString(basicSearch(arr, n)));

    }

    public static int[] basicSearch(int []arr , int n){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==  n)
                al.add(i);
        }
        Integer[] temp = al.toArray(new Integer[0]);
        int []result = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
