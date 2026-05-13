package upperpart.commonalgorithms.sorting;

import java.util.Arrays;

public class BubbleSorting {
    static void main(String[] args) {
        /*
            冒泡排序：
            核心思想：
            1，相邻的元素两两比较，大的放右边，小的放左边。
            2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
            3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
          */
        int[]arr = {12,24,54,4,5,23,65,75};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    //冒泡排序
    public static int[] bubbleSort(int[] arr){
        //外循环控制循环次数,一次循环可以将一个值放到最后面
        for (int i = 0; i < arr.length-1; i++) {
            //内循环来交换元素
            for(int j = 0 ; j<arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
