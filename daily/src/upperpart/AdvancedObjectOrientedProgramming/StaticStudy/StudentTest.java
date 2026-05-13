package upperpart.AdvancedObjectOrientedProgramming.StaticStudy;

public class StudentTest {
    static void main(String[] args) {
        Student.teacherName = "龙哥";
        Student s1 = new Student("小陈",18,"女");
        s1.study();
        s1.show();


    }
}
