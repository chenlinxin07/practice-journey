package upperpart.ObjectOrientedBeginner.Girlfriend;

public class GirlFriend {

    //属性
    private String   name;
    private int  age;
    private String gender;
    private double high;
    private double weight;


    //针对于每一个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值
    //作用：给成员变量name进行赋值的
    public void setname(String nama){
        this.name = nama;
    }

    public String getname(){
        return this.name;
    }

    //年龄
    public  void setage(int age){
        if(age>=18 && age<=100){
            this.age = age;
        }
        else{
            System.out.println("输入年龄非法");
        }
    }

    public int getage(){
        return this.age;
    }

    //性别
    public void setgender(String gander){
        this.gender = gender ;
    }

    public  String getgender(){
        return gender;
    }



    //行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
