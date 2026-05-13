package upperpart.advancedsets.set;

import java.util.HashSet;

public class HashSetDemo_Test {
    static void main(String[] args) {
        /*
            需求：创建一个存储学生对象的集合，存储多个学生对象。
            使用程序实现在控制台遍历该集合。
            要求：学生对象的成员变量值相同，我们就认为是同一个对象
            这个只需要在你创建的类里,按alt+ins重写hashCode就可以了,
            不然是比较地址值,重写了是比较元素内容
            注: 像String 和integer这些自带的我们就不用写,系统自带了
        */
        //1.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);


        //2.创建集合用来添加学生
        HashSet<Student> hs = new HashSet<>();

        //3.添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        //4.打印集合
        System.out.println(hs);




    }
}
