package upperpart.api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList200 {
    static void main(String[] args) {
        /*
            键盘录入一些1~10日之间的整数，并添加到集合中。
            直到集合中所有数据和超过200为止。
        */
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sum<=200){
            System.out.println("请输入一个整数");
            String s = sc.nextLine();
            int n = Integer.parseInt(s);
            if(sum+n>200&&!arr.isEmpty())
                break;
            if(n>=0&&n<=100){
                sum += n;
                arr.add(s);
            }
            else {
                System.out.println("数字不符合规范");
            }
        }
        System.out.println("已输入完成"+"最终和为"+sum);
        System.out.println(arr);
    }
}
