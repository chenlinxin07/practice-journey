package lowerpart.exception;

public class AbnormalHandlingMethods1 {
    static void main(String[] args) {
/*
demo5
        JVM默认处理异常的方式：
            1. 把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
            2. 程序停止执行，异常下面的代码不会再执行了
        */
//        System.out.println("狂踹瘸子那条好腿");
//        System.out.println(2/0);//算术异常 ArithmeticException
//        System.out.println("是秃子终会发光");
//        System.out.println("火鸡味锅巴");


/*
demo6
            自己处理（捕获异常）
            格式：
                try {
                   可能出现异常的代码;
                } catch(异常类名 变量名) {
                   异常的处理代码;
                }
             好处:可以让程序继续往下执行，不会停止
         */
        int[] arr = {1, 2, 3, 4, 5, 6};
        try{
            //可能出现异常的代码;
            System.out.println(arr[10]);//此处出现了异常，程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
                                        //new ArrayIndexOutOfBoundsException();
                                        //拿着这个对象到catch的小括号中对比，看括号中的变量是否可以接收这个对象
                                        //如果能被接收，就表示该异常就被捕获（抓住），执行catch里面对应的代码
                                        //当catch里面所有的代码执行完毕，继续执行try...catch体系下面的其他代码
        }catch(ArrayIndexOutOfBoundsException e){
            //如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗？");


//抛出处理demo12在ThrowProcessing这个类里
    }
}
