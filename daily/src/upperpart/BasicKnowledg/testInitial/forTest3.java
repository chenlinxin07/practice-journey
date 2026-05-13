package upperpart.BasicKnowledg.testInitial;

public class forTest3 {
    static void main(String[] args) {
        //求一到一百的偶数和
        int sum = 0;
        //100.fori 是循环的快速生成快捷
        //100为循环次数,生成的for循环从0开始
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
