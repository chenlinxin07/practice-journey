package upperpart.api;

public class MathAPI {
    //需要知道名字和用来干什么
//    public static int abs(int a)					// 返回参数的绝对值
//    public static double ceil(double a)			// 返回大于或等于参数的最小整数
//    public static double floor(double a)			// 返回小于或等于参数的最大整数
//    public static int round(float a)				// 按照四舍五入返回最接近参数的int类型的值
//    public static int max(int a,int b)			// 获取两个int值中的较大值
//    public static int min(int a,int b)			// 获取两个int值中的较小值
//    public static double pow (double a,double b)	// 计算a的b次幂的值
//    public static double sqrt(double a)			// 返回a的平方根
//    public static double cbrt(double a)			// 返回a的立方根
//    public static double random()					// 返回一个[0.0,1.0)的随机值

    static void main(String[] args) {
        System.out.println(Math.absExact(-88));
        System.out.println(Math.absExact(88));
        //bug:
        //以int类型为例，取值范围: -2147483648~ 2147483647
        //如果没有正数与负数对应，那么传递负数结果有误
        //-2147483648 没有正数与之对应，所以abs结果产生bug
        //system.out.println(Math.abs(-2147483647));//2147483647
        //System.out.println(Math.absExact(-2147483648));
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(88));


    }
}
