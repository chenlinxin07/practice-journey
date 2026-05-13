
//把2135变成：零佰零拾零万贰仟壹佰叁拾伍元
//把789变成：零佰零拾零万零仟柒佰捌拾玖元
package upperpart.StringDemo.String;

import java.util.Scanner;

public class ConvertUppercaseAmountToLowercase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入金额
        int money = 0;
        System.out.println("请输入金额");
        while(true){
            money = sc.nextInt();
            if(money>0 && money<9999999){
                break;
            }
            else{
                System.out.println("输入金额不合法");
            }
        }

        String moneyStr = "";
        while(money!=0){
            int ge = money%10;
            money /= 10;
            String geStr = getCapitalNumber(ge);
            moneyStr = geStr + moneyStr;
        }
        System.out.println(moneyStr);

        //补全七位
        moneyStr = CompleteSevenDigits(moneyStr);

        System.out.println("\n" + moneyStr);

        //加上单位Add unit
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result = result + moneyStr.charAt(i) + arr[i];
        }

        System.out.println("\n" + result);


    }


    //补全七位
    private static String  CompleteSevenDigits(String moneyStr) {
        while(moneyStr.length()<7){
            moneyStr = "零"+ moneyStr;
        }
        return moneyStr;
    }

    //定义一个方法把数字变成大写的中文
    //1 -- 壹
    public static String getCapitalNumber(int number) {
        //定义数组，让数字跟大写的中文产生一个对应关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //返回结果
        return arr[number];
    }
}
