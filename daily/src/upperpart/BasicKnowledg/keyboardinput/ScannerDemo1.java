package upperpart.BasicKnowledg.keyboardinput;//1.导包,找到Scanner这个类在哪
//书写要注意:要写在类定义的上面
import java.util.Scanner;
public class ScannerDemo1{
    public static void main(String []args){
        //2.创建对象,表示我现在要用Scanner这个类
        Scanner sc = new Scanner(System.in);

        //3.接收数据
        //变量i记录了我们键盘输入的数据
        System.out.println("请输入一个整数");

        int i = sc.nextInt();

        System.out.println(i);
    }

}