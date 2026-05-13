package upperpart.commonalgorithms.fiveclassicalgorithmproblems;

public class MonkeysEatPeaches {
    static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，并再多吃 1 个；
        以后每天猴子都吃 “当前剩下桃子的一半，再加 1 个”。
        到第 10 天的时候（还没吃），只剩下 1 个桃子。请问：最初总共有多少个桃子？
        */
        int sum = 1;
        for (int i = 0; i < 9; i++) {
            sum = (sum + 1)*2;
        }
        System.out.println(sum);

        int a = getCount(1);
        System.out.println(a);

    }

    public static int getCount(int day) {
        // 1. 合法性校验：天数必须在1~10之间
        if (day <= 0 || day > 10) {
            System.out.println("当前时间错误");
            return -1;
        }

        // 2. 递归出口：第10天（未吃）时，桃子只剩1个
        if (day == 10) {
            return 1;
        }

        // 3. 递归公式：前一天的桃子数 = (后一天的桃子数 + 1) × 2
        return (getCount(day + 1) + 1) * 2;
    }
}
