package upperpart.BasicKnowledg.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    //创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
    static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("请输入学生个数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("请输入学生信息");
            Student s = new Student();
            s.setName(sc.next());
            s.setAge(sc.nextInt());
            s.setID(sc.nextInt());
            list.add(s);
        }
        System.out.println(list);
    }
}
