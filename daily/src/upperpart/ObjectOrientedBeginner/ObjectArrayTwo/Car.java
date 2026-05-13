package upperpart.ObjectOrientedBeginner.ObjectArrayTwo;

public class Car {
    private String brand;
    private Double price;
    private String color;

    public Car() {
    }

    public Car(String brand, Double price, String color) {
        this.brand = brand;
       this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printCar(){
        System.out.println(this.brand+" "+this.price+" "+this.color);
    }
}
