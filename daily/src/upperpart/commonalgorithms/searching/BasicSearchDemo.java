package upperpart.commonalgorithms.searching;

import java.util.Scanner;

public class BasicSearchDemo {
    static void main(String[] args) {
        //基本查找/顺序查找
        //核心：
        //从0索引开始挨个往后查找

        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：{131, 127, 147, 81, 103, 23, 7, 79}
        int []arr = {131, 127, 147, 81, 103, 23, 7, 79};
        System.out.println("请输入要查找的数据");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(basicSearch(arr,n));
    }
    public static boolean basicSearch(int []arr , int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n)
                return true;
        }
        return false;
    }
}
