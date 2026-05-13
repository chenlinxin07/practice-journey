package upperpart.advancedsets.generictype.test;

public class PersianCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"，"+getAge()+"岁的波斯猫，正在吃小饼干");
    }
}
