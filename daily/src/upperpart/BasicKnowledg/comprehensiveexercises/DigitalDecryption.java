package upperpart.BasicKnowledg.comprehensiveexercises;

import java.util.Scanner;

public class DigitalDecryption {
    static void main(String[] args) {

        /*
            数字加密的方法:
            现要求解密
            某系统的数字密码(大于0).比如1983,采用加密`方式进行传输
            规则如下:
            每位数加上5
            再对10求余最后将数字反转,
            得到一串新数
        */

        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numlength = 0;
        numlength = getNumlength(num, numlength);

        int []arr =new int [numlength];

        //将数字装入数组
        System.out.println("装入数组");
        setArr(numlength, num, arr);

        //打印数组
        printarr(numlength,arr);

        //反转数组
        System.out.println("反转后的数组");
        reverseArr(numlength, arr);

        //打印数组
        printarr(numlength,arr);

        //还原对加5后对10求余
        restoreModuloTen(numlength, arr);

        //打印数组
        System.out.println("还原了对数字取余后的数组");
        printarr(numlength,arr);

        //数组元素减五
        //数组元素减五
        reduceFiveArr(numlength,arr);

        //打印数组
        System.out.println("数组元素减五");
        printarr(numlength,arr);


        //合并数组
        int result = mergeArr(numlength, arr);

        System.out.println("最终结果为" + result);

    }

    private static void restoreModuloTen(int numlength, int[] arr) {
        //还原对加5后对10求余
        for (int i = 0; i < numlength; i++) {
            if(arr[i]>=0 && arr[i]<=4){
                arr[i] += 10;
            }
        }
    }


    private static int getNumlength(int num, int numlength) {
        //求数字长度
        int getlength = num;
        while(getlength != 0){
            getlength /= 10;
            numlength++;
        }
        return numlength;
    }

    private static void setArr(int numlength, int num, int[] arr) {
        //将数字装入数组
        System.out.println("数组内元素");
        for (int i = numlength -1; i >= 0; i--) {
            int temp = num %10;
            arr[i] = temp;
            num /=10;
        }
    }

    private static void reverseArr(int numlength, int[] arr) {
        //反转数组
        for (int i = 0; i < numlength /2; i++) {
            int temp = arr[i];
            arr[i] = arr[numlength -1-i];
            arr[numlength -1-i] = temp;
        }
    }

    private static void reduceFiveArr(int numlength, int[] arr) {
        //每位数减上五
        for (int i = 0; i < numlength; i++) {
            arr[i] -= 5;
        }
    }

    private static int mergeArr(int numlength, int[] arr) {
        //合并数组
        int result = 0;
        for (int i = 0; i < numlength; i++) {
            result = result*10 + arr[i];
        }
        return result;
    }


    private static void printarr(int numlength, int[] arr) {
        //打印数组
        for (int i = 0; i < numlength; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
