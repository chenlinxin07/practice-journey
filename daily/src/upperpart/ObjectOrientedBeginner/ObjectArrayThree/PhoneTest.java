package upperpart.ObjectOrientedBeginner.ObjectArrayThree;

import java.util.Scanner;

public class PhoneTest {
    static void main(String[] args) {
        Phone []arr = new Phone[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Phone p = new Phone();
            System.out.println("请输入品牌");
            String a = sc.next();
            p.setBrand(a);
            System.out.println("请输入价格");
            double b = sc.nextDouble();
            p.setPrice(b);
            System.out.println("请输入颜色");
            String c = sc.next();
            p.setColor(c);
            arr[i] = p;
        }
        double sum = 0.0,avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        avg = sum/arr.length;
        System.out.println("三部手机的平均价格为"+avg);
    }
}
