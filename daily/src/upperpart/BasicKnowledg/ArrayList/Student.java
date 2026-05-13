package upperpart.BasicKnowledg.ArrayList;

public class Student {
    public static Object theacher;
    public static String theacherName;
    private String name;
    private int age;
    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Student() {
    }

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    // 3. 【核心】重写 toString() 定义输出格式
    @Override
    public String toString() {
        return "姓名：" + name + " 年龄：" + age + " 学号：" + ID;
    }
}
