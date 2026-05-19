package lowerpart.myreflect.myreflect1;

public class MyReflectDemo {
    static void main(String[] args) throws ClassNotFoundException {

        /*
         * 获取class对象的三种方式：
         *   1. Class.forName("全类名");
         *   2. 类名.class
         *   3. 对象.getClass();
         *
         * */
        //1. 第一种方式


        //1.第一种
        //全类名 : 包名 + 类名 lowerpart.myreflect.myreflect1.Student
        //不要自己写,可以到要粘贴的类那里 右键类名 然后选择复制引用就可以了
        //最为常用的
        Class clazz = Class.forName("lowerpart.myreflect.myreflect1.Student");
        //打印
        System.out.println(clazz);

        //2.第二种
        //一般更多的是当做参数进行传递
        Class clazz2 = Student.class;

        //3.第三种
        //当我们已经有了这个类的对象时，才可以使用。
        Student s = new Student();
        Class clazz3 = s.getClass();

        System.out.println(clazz == clazz2);
        System.out.println(clazz2 == clazz3);
        System.out.println(clazz == clazz3);
    }
}
