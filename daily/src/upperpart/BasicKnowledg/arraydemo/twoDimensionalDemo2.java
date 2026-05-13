package upperpart.BasicKnowledg.arraydemo;

import java.util.Random;

public class twoDimensionalDemo2 {
    static void main(String[] args) {
        /*
        二维数据动态初始化格式:
            数据类型[][] 数组名 = new 数据类型[m][n];
            m表示这个二维数组可以存放多少个一维数组(即行数)
            n表示一维数组可以放多少个元素(即列数)
         */


        //1.利用动态初始化格式创建二维数组
        //3:表示二维数组长度为3，可以装3个一维数组
        //5：表示每一个一维数组的长度都是5，可以装5个int类型的元素
        int arr[][] = new int[3][5];

        //给二维数组赋值一个元素
        arr[0][0] = 10;

        Random r = new Random();
        //遍历二维数组
        //外循环：遍历二维数组获取里面的每一个一维数组
        //内循环：遍历一维数组获取每一个元素
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = r.nextInt(0,100);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        //特殊情况一
        int[][] arr1 = new int[2][];
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {6, 3, 0, 34, 54, 5};
        arr1[0] = arr2;
        arr1[1] = arr3;


        //特殊情况二
        int[][] arr4 = new int[2][3];
        int[] arr5 = {11, 12, 13, 14};
        int[] arr6 = {21, 22, 23, 24, 25};
        //换前
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = r.nextInt(0, 100);
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        arr4[0] = arr5;
        arr4[1] = arr6;
        //换后(换的是arr5里储存的地址,即一堆数组的地址)
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = r.nextInt(0, 100);
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
