package upperpart.AdvancedObjectOrientedProgramming.Inheritance.InheritanceContainsRewrites;

public class Test {
    static void main(String[] args) {
        //创建对象并赋值调用
        Manager m = new Manager("01","小陈",15000,8000);
        System.out.println(m.getId() + ", " + m.getName() +
                ", " + m.getSalary() + ", " + m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("02");
        c.setName("小小陈");
        c.setSalary(8000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}

