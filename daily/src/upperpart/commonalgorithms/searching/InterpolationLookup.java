package upperpart.commonalgorithms.searching;

import java.util.Scanner;

public class InterpolationLookup {
    static void main(String[] args) {
        //插值查找
        //核心：
        //按占比查找,根据比例自适应取适当比例(二分查找是固定取中间的值)

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}
        int []arr ={7, 23, 79, 81, 103, 127, 131, 147};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素");
        int n = sc.nextInt();
        //int i = binarySearch(arr,n);
        System.out.println(binarySearch(arr,n));

    }
    public  static  int binarySearch(int [] arr,int n ){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (n - arr[low]) * (high - low) / (arr[high] - arr[low]);
            if(arr[mid] == n)
                return mid;
            else if(arr[mid] > n)
                high = mid-1;
            else if(arr[mid] < n)
                low = mid + 1;
        }
        System.out.println("没有该元素");
        return -1;
    }
}
