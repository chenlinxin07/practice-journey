package upperpart.ObjectOrientedBeginner.student;

public class Student {

        private String name;
        private int age;

        //构造方法是在创建对象时,给成员变量进行初识化的
        //构造方法分空参和实参
        //不管用不用,无参构造方法 和 带全部参数的方法都要全部写上!!!!!!!!!

        //空参构造
        public Student (){
            System.out.println("看看我打印了吗?");
        }

        //有参构造
        public Student(String name , int age){
            this.age = age;
            this.name = name;
        }


        public void setName(String name){
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
        }
}
