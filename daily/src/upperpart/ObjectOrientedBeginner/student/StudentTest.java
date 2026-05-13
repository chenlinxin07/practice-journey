package upperpart.ObjectOrientedBeginner.student;

public class StudentTest {
    static void main(String[] args) {
        //创建对象
        //调用的空参构造
        //如果已经构造有参构造但是没有额外写无参构造的话,下面将报错
        //没有写构造方法的话系统默认无参构造
        Student s = new Student();

        //调用带参构造
        Student s1 = new Student("药药" , 18);
        System.out.println(s1.getName());;
        System.out.println(s1.getAge());;


    }
}
