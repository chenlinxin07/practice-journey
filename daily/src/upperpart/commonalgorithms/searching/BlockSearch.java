package upperpart.commonalgorithms.searching;

import java.util.Scanner;

public class BlockSearch {
    static void main(String[] args) {
        /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可
        */
        int[] arr = {16, 5, 9, 12,21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(66,12,17);
        Block[] blockArr ={b1,b2,b3};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的元素");
        int x = sc.nextInt();
        System.out.println(whatIndex(arr , blockArr , x));
    }

    //查找在哪一个块
    public static int whichBlock(Block []blockarr,int n){
        for (int i = 0; i < blockarr.length; i++) {
            if(n<blockarr[i].getMax())
                return i;
        }
        return -1;
    }

    //查找具体索引
    public static int whatIndex(int[]arr, Block[]blockarr , int n){
        int bl = whichBlock(blockarr,n);
        if(bl == -1)
            return -1;
        int startIndex = blockarr[bl].getStartindex();
        int endIndex = blockarr[bl].getEndIndex();
        for(int i = startIndex ; i<=endIndex ; i++){
            if(arr[i] == n)
                return i;
        }
        return -1;
    }
}


class Block{
    private int max;//最大值
    private int startindex;//起始索引
    private int endIndex;//结束索引

    public Block() {
    }

    public Block(int max, int startindex, int endIndex) {
        this.max = max;
        this.startindex = startindex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startindex
     */
    public int getStartindex() {
        return startindex;
    }

    /**
     * 设置
     * @param startindex
     */
    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startindex = " + startindex + ", endIndex = " + endIndex + "}";
    }
}
