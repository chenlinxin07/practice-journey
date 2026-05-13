package upperpart.ObjectOrientedBeginner.ObjectArrayOne;

public class Goods {

    private  String ID ;
    private String name;
    private double price;
    private int stock;

    public Goods() {
    }

    public Goods(String ID, String name, double price, int stock) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void printGoods(Goods g){
        System.out.println(this.ID+' '+this.name+' '
                +this.price+' '+this.stock);
    }
}

