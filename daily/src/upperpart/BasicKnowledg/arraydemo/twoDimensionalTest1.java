package upperpart.BasicKnowledg.arraydemo;

public class twoDimensionalTest1 {
    static void main(String[] args) {
        /* 某商城每个季度的营业额如下：单位（万元）
        第一季度：22, 66, 44
        第二季度：77, 33, 88
        第三季度：25, 45, 65-维数组
        第四季度：11, 66, 99一维数组
        要求计算出每个季度的总营业额和全年的总营业额*/

        //创建二维数组并存储数据
        int [][]yearArr = {
                {22,66,44},
                {77,33,88},
                {22,66,44},
                {11,66,99}
        };
        int  []seasonArr = new int  [yearArr.length];
        for (int i = 0; i < yearArr.length; i++) {
            seasonArr[i] = getseason(yearArr[i]);
        }
        printseason(seasonArr);
       int yearnum  = getseason(seasonArr);
        System.out.println("年营业额为"+yearnum);
    }


    //打印季度营业额
    private static void printseason(int[] seasonArr) {
        System.out.println("以下是季度营业额");
        for (int i = 0; i < seasonArr.length; i++) {
            System.out.print(seasonArr[i] + " ");
        }
        System.out.println();
    }

    //求季营业额,年营业额
    static int getseason(int[] season)
    {
        int sum = 0;
        for (int i = 0; i < season.length; i++) {
            sum += season[i];
        }
        return sum;
    }

}
