package upperpart.commonalgorithms.sorting;

import java.util.Arrays;

public class QuickSorting {
    static void main(String[] args) {
     /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
      */
        int[]arr = {12,24,54,4,5,23,65,75};
        System.out.println(Arrays.toString(quikSort(arr,0,arr.length-1)));
    }

    //快速排序
    //千万注意千万注意
    // 如果用0位置作为基准数,必须先移动end
    //如果用arr.length-1作为基准数,必须先移动start,
    //不然最后end和start交换位置的时候会使得交换错误,
    //比基准数大的或者小的去了相反的另一边
    public static int[] quikSort(int[] arr , int i, int j){
        int start = i;
        int end = j;

        if(start>end){
            return arr;
        }

        int baseNumber = arr[i];

        //利用循环找到要交换的数字
        while(start != end){
            //end往前移动直到找到比基准数小的数字
            while(true){
                if(end<=start || arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            //start往后移动直到找到比基准数大的数字
            while(true){
                if(end<=start || arr[start]>baseNumber){
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quikSort(arr,i,start-1);
        quikSort(arr,start+1 , j);
        return arr;
    }
}
