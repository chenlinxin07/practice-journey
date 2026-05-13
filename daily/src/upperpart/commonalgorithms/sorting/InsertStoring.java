package upperpart.commonalgorithms.sorting;

import java.util.Arrays;

public class InsertStoring {
    static void main(String[] args) {
        /*
            插入排序：
                将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
                遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
                N的范围：0~最大索引
        */
        int[]arr = {12,24,54,4,5,23,65,75};
        System.out.println(Arrays.toString(insertStore(arr)));

    }

    //插入排序
    public static int[] insertStore(int[] arr){
        int startaindex = -1;
        //找到从哪里开始查
        //1.找到无序的哪一组数组是从哪个索引开始的。
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                startaindex = i + 1;
                break;
            }
        }
        //System.out.println(startaindex);

        //进行插入
        //2.遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中的每一个元素
        for (int i = startaindex; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                //交换位置
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
}
