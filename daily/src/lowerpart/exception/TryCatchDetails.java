package lowerpart.exception;

public class TryCatchDetails {
    static void main(String[] args) {
/*
demo7
            自己处理（捕获异常）灵魂四问：
                灵魂一问：如果try中没有遇到问题，怎么执行？
                            会把try里面所有的代码全部执行完毕，不会执行catch里面的代码
                            注意：
                                只有当出现了异常才会执行catch里面的代码


         */
        System.out.println("================= 1一问 ===================");
        int[] arr = {1, 2, 3, 4, 5, 6};

        try{
            System.out.println(arr[0]);//1
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗？");//看看我执行了吗？


/*
demo8
            自己处理（捕获异常）灵魂二问：
                        如果try中可能会遇到多个问题，怎么执行？
                        会写多个catch与之对应(从上往下依次匹配)
                        细节：
                            如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
                        了解性：
                            在JDK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
                            表示如果出现了A异常或者B异常的话，采取同一种处理方案
         */
        //JDK7
        System.out.println("================= 2二问 ===================");
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        try{
            System.out.println(arr2[10]);//ArrayIndexOutOfBoundsException
            System.out.println(2/0);//ArithmeticException
            String s = null;
            System.out.println(s.equals("abc"));
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("索引越界了");
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("Exception");
        }

        System.out.println("看看我执行了吗？");


/*
demo9
            自己处理（捕获异常）灵魂三问：
                如果try中遇到的问题没有被捕获，怎么执行？
                相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理。
         */
        System.out.println("================= 3三问 ===================");
        int[] arr3 = {1, 2, 3, 4, 5, 6};

        try{
            System.out.println(arr3[10]);//new ArrayIndexOutOfBoundsException();
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗？");


/*
demo10
            自己处理（捕获异常）灵魂四问：
                如果try中遇到了问题，那么try下面的其他代码还会执行吗？
                下面的代码就不会执行了，直接跳转到对应的catch当中，执行catch里面的语句体
                但是如果没有对应catch与之匹配，那么还是会交给虚拟机进行处理
         */
        System.out.println("================= 4四问 ===================");
    int[] arr4 = {1, 2, 3, 4, 5, 6};

    try {
        System.out.println(arr4[10]);
        System.out.println("看看我执行了吗？... try");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("索引越界了");
    }

    System.out.println("看看我执行了吗？... 其他代码");
    }
}
