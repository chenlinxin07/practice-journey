package lowerpart.exception.Test;

public class BoyFriend {
    private String name;
    private int age;

    public BoyFriend() {
    }

    public BoyFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        if(name.length()<2 || name.length()>10){
            throw new RuntimeException();
        }
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if(age<18 || age>25){
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String toString() {
        return "BoyFriend{name = " + name + ", age = " + age + "}";
    }
}
