package upperpart.ObjectOrientedBeginner.ObjectArrayFive;

public class Student {
    private int StudentID;
    private String name;
    private int age;

    public Student() {
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

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

    public Student(int studentID, String name, int age) {
        StudentID = studentID;
        this.name = name;
        this.age = age;
    }
}

