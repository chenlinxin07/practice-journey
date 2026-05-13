package lowerpart.exception;

public class ExceptionEffect {
    static void main(String[] args) {
/*
Demo2
            异常作用一：异常是用来查询bug的关键参考信息
            异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
        */

        Student[] arr = new Student[3];// null null null
        String name = arr[0].getName();
        System.out.println(name);


/*
Demo3
            异常作用一：异常是用来查询bug的关键参考信息
            异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
        */
        //异常作用一
        Student2 stu = new Student2("张三,23");
        System.out.println(stu);

        //异常作用二
        //1.创建学生对象
        Student s1 = new Student();
        //年龄：（同学） 18~40岁
        s1.setAge(50);//就知道了50赋值失败
        //选择1：自己悄悄处理
        //选择2：打印在控制台上



    }
}
