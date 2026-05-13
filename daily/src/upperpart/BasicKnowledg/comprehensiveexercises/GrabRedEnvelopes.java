package upperpart.BasicKnowledg.comprehensiveexercises;

import java.util.Random;

public class GrabRedEnvelopes {
    static void main(String[] args) {
    /*
        红包的金额分为2,588,888,1000,10000
        现要随机抽取红包
     */

        //方法一:随机抽取
        System.out.println("方法一:");
        int[] arr = {2, 588, 888, 1000, 10000};

        Random r = new Random();

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; ) {
            int randomIndex = r.nextInt(arr.length);
            int price = arr[randomIndex];
            //随机抽取,如果已被抽取就再次循环,i不增加,直到抽到未被抽取到的,i++
            if (!contains(newArr, price)) {
                newArr[i] = price;
                i++;
            }
        }

        //打印奖项
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + "被抽出");
        }

        System.out.println();
        System.out.println();

        //方法二:将奖池打乱,顺序抽取

        System.out.println("方法二");
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //打印奖项
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "被抽出");
        }
    }

    private static boolean contains(int[] newArr, int price) {
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i] ==price){
                return true;
            }
        }
        return false;
    }

}
