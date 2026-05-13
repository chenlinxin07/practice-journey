package upperpart.ObjectOrientedBeginner.TextBasedFightingGamePro;

public class GameTest {
    static void main(String[] args) {
        Role r1 = new Role("丽姬", 100,'女');
        Role r2 = new Role("歌姬", 100,'女');
        while (r1.getBlood() > 0 && r2.getBlood() > 0) {
            if (r1.getBlood() != 0) {
                r1.attack(r2);
            }
            if (r2.getBlood() != 0) {
                r2.attack(r1);
            }
        }
        System.out.println((r1.getBlood() == 0 ? r2.getName() : r1.getName()) +
                "KO了" + (r1.getBlood() != 0 ? r2.getName() : r1.getName()));

       r1.showRoleOnto();
       r2.showRoleOnto();

    }
}
