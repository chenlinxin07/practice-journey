package upperpart.ObjectOrientedBeginner.TextBasedFightingGamePro;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private String face;
    private char gender;
    Random r = new Random();
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊",
            "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立",
            "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        if (gender == '男') {
            int randomIndex = r.nextInt(boyfaces.length);
            this.face = boyfaces[randomIndex];
        } else if (gender == '女') {
            int randomIndex = r.nextInt(girlfaces.length);
            this.face = girlfaces[randomIndex];
        } else {
            this.face = "不明物种";
        }
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
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
//    public void attack(Role role) {
//        Random r = new Random();
//
//        //攻击效果
//        int index = r.nextInt(attacks_desc.length);
//        String kungFU = attacks_desc[index];
//
//        //造成伤害
//        int heart = r.nextInt(1, 20);
//        int remainBlood = role.getBlood() - heart;
//        remainBlood = remainBlood < 0 ? 0 : remainBlood;
//        //被挨揍者剩下的血量
//        role.setBlood(remainBlood);
//
//        //受伤的描述
//        int index1 = r.nextInt(injureds_desc.length);
//        String injury = injureds_desc[index];
//
//        //this表示方法的调用者
//        System.out.println(this.getName() +kungFU + ","+role.getName()+injury );
//    }


    // 用于攻击别人的算法
    public void attack(Role role) {
        // 1. 随机选择攻击描述
        int attackIndex = r.nextInt(attacks_desc.length);
        String attackText = attacks_desc[attackIndex];

        // 2. 用printf替换%s：第一个%s=攻击者，第二个%s=被攻击者
        System.out.printf(attackText, this.getName(), role.getName());

        // 3. 随机生成伤害（1-20）
        int damage = r.nextInt(1, 21);
        int remainBlood = role.getBlood() - damage;
        remainBlood = Math.max(remainBlood, 0); // 血量不能为负
        role.setBlood(remainBlood);

        // 4. 随机选择受伤描述，同样用printf替换%s
        int injuredIndex = 0;
        // 根据剩余血量选择受伤程度（可选优化）
        if (remainBlood >= 80) injuredIndex = 0;
        else if (remainBlood >= 60) injuredIndex = 1;
        else if (remainBlood >= 40) injuredIndex = 2;
        else if (remainBlood >= 20) injuredIndex = 3;
        else if (remainBlood > 0) injuredIndex = 4;
        else injuredIndex = 7; // 血量为0时用最严重的描述

        String injuredText = injureds_desc[injuredIndex];
        System.out.printf(injuredText + "%n", role.getName()); // %n是换行符
    }


    public void showRoleOnto(){
        System.out.println("姓名为"+name);
        System.out.println("性别为"+gender);
        System.out.println("血量为"+blood);
        System.out.println("长相为"+face);

    }

}

