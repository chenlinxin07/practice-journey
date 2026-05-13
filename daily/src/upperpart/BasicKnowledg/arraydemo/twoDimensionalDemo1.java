package upperpart.BasicKnowledg.arraydemo;

public class twoDimensionalDemo1 {
    static void main(String[] args) {
        //1. 二维数组的静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //以后建议这样定义,把每一个一堆数组单独成一行
        //注意,每一个一堆数组都是二维数组的元素,所以每一个一堆数组之间都要用逗号隔开,最后一个不用
        //二维数组存了若干个地址
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

        //2. 获取元素
        //System.out.println( arr3[0] );表示获取二维数组里的第一个一维数组,打印值为地址
        //System.out.println(arr3[0][0]); 表示二维数组里的第一个一维数组的第一个元素,打印的是 1;

        System.out.println(arr3[0][0]);//1
        System.out.println(arr3[1][4]);//8
        //System.out.println(arr3[2][3]);//数组下标越界ArrayIndexOutOfBoundException

        //3. 二维数组的遍历
        for (int i = 0; i < arr3.length; i++) {
            //i表示二维数组的每一个索引
            //arr3[i]表示二维数组的每一个元素(一堆数组)
            for (int j = 0; j < arr3[i].length; j++) {
                //j表示一维数组的每一个索引
                //arr3[i][j]表示一维数组的每一个元素
                System.out.print(arr3[i][j] + " ");
            }
        }
    }
}
