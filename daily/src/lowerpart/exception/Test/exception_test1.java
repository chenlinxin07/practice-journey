package lowerpart.exception.Test;

import java.util.Scanner;

public class exception_test1 {
    static void main(String[] args) {
        /*
            需求：
                键盘录入自己心仪的女朋友姓名和年龄。
                姓名的长度在 2 - 10之间，
                年龄的范围为 18 - 25岁,
                超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止。
            提示：
                需要考虑用户在键盘录入时的所有情况。
                比如：录入年龄时超出范围，录入年龄时录入了abc等情况
        */

        Scanner sc = new Scanner(System.in);
        BoyFriendPro bf = new BoyFriendPro();

        while (true) {
            try {
                System.out.println("请输入你心仪的男朋友的名字");
                String name = sc.nextLine();
                bf.setName(name);

                System.out.println("请输入他的年龄");
                String age = sc.nextLine();
                bf.setAge(Integer.parseInt(age));

                //如果说运行到这里,就说明所有都是对的,就可以跳出循环
                break;

            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误,请输入数字");
            } catch (RuntimeException e) {
                System.out.println("姓名的长度或者年龄的范围有误");
            }
        }

        System.out.println(bf);
    }
}
