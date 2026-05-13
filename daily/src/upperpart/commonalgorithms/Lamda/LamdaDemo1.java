package upperpart.commonalgorithms.Lamda;

public class LamdaDemo1 {
    // 1. 定义函数式接口（只有一个抽象方法的接口）
    @FunctionalInterface
    interface Swim {
        // 抽象方法：游泳
        void swimming();
    }

    public class LambdaDemo2 {
        public static void main(String[] args) {

            // ---------------- 方式1：匿名内部类写法 ----------------
            System.out.println("===== 匿名内部类写法 =====");
            method(new Swim() {
                @Override
                public void swimming() {
                    System.out.println("我正在游泳~~~");
                }
            });

            // ---------------- 方式2：Lambda表达式写法 ----------------
            System.out.println("\n===== Lambda表达式写法 =====");
            method(() -> {
                System.out.println("桑启宝宝正在游泳~~~");
            });

            // Lambda 还可以进一步简化（方法体只有一行时，可省略大括号）
            System.out.println("\n===== Lambda 简化写法 =====");
            method(() -> System.out.println("小乔大王正在游泳~~~"));
        }

        // 定义方法，参数为 Swim 接口类型
        public static void method(Swim s) {
            s.swimming(); // 调用接口的抽象方法
        }
    }
}
