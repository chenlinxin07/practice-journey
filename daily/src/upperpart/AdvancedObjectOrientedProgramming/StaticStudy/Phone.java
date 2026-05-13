package upperpart.AdvancedObjectOrientedProgramming.StaticStudy;

public class Phone {
    private String brand;
    private int price;
    public static int size;

    public void call(){
        System.out.println(this.brand+"在打电话");
    }

    public void sendMessage(){
        System.out.println(this.brand+"在发短信");
    }

    public void playGame(String gameName){
        System.out.println(this.brand+"在玩"+gameName);
    }


    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

//    public void show(){
//        System.out.println(this.brand+" "+this.price);
//    }
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size+
                '}';
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone() {
    }
}
