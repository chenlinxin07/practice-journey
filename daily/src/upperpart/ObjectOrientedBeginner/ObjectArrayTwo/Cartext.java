package upperpart.ObjectOrientedBeginner.ObjectArrayTwo;

import java.util.Scanner;

public class Cartext {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[3];
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入品牌");
            String m = sc.next();
            c.setBrand(m);
            System.out.println("请输入价格");
            double n = sc.nextDouble();
            c.setPrice(n);
            System.out.println("请输入颜色");
            m = sc.next();
            c.setColor(m);
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+" "+car.getPrice()+" "+ car.getColor());
        }
    }
}
