package lowerpart.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Function_Test2 {
    static void main(String[] args) {
          /*
        *   需求：
        *       创建集合添加学生对象
        *       学生对象属性：name，age
        *   要求：
        *       获取姓名并放到数组当中
        *       使用方法引用完成
           */
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2.添加元素
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));

        //3.获取姓名并放到数组当中

        //我的方法
        Student[] arr1 = list.stream().toArray(Student[]::new);
        String[] arr2 = Arrays.stream(arr1).map(s-> s.getName()).toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));

        //阿伟的方法
        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
