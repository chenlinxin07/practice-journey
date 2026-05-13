package upperpart.ObjectOrientedBeginner.TextBasedFightingGame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    //用于攻击别人的算法
    public void attack(Role role) {
        Random r = new Random();
        int heart = r.nextInt(1, 20);
        int remainBlood = role.getBlood() - heart;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //被挨揍者剩下的血量
        role.setBlood(remainBlood);

        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头打了" + role.getName() + "一下"
                + "造成了" + heart + "伤害," + role.name + "还剩" + role.getBlood() + "点血");

    }
}
