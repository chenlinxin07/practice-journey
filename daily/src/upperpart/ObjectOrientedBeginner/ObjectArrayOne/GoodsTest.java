package upperpart.ObjectOrientedBeginner.ObjectArrayOne;

public class GoodsTest {
    static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("a0001","华为",5999.9,10);
        Goods g2 = new Goods("a0002","vivo",6999.9,15);
        Goods g3 = new Goods("a0003","oppo",3999.9,55);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            arr[i].printGoods(arr[i]);
        }
    }
}
