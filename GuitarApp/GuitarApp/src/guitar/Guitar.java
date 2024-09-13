package guitar;

public class Guitar {
    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String type;
    private String backWood;
    private String topWood;

    public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood) {
        if(price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }else {
            this.price = price;
        }
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = this.price + price;
        }
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return String.format("serialNumber: %4s, price: %4.2f, builder: %4s, model: %4s, type: %4s, backWood: %4s, topWood: %4s", serialNumber, price, builder, model, type, backWood, topWood);
    }

}
