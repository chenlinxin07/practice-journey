package upperpart.ObjectOrientedBeginner.Girlfriend;

public class GirlFriendTest {
    static void main(String[] args) {

        //创建女朋友对象
        GirlFriend gf1 = new GirlFriend();

        gf1.setname("桑启");
        System.out.println(gf1.getname());

        gf1.setage(18);
        System.out.println(gf1.getage());

        gf1.setgender("小正太");
        System.out.println(gf1.getgender());

        gf1.sleep();
        gf1.eat();
    }
}
