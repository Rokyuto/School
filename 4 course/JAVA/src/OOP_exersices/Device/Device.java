public class Device {
    private String brand,model;
    private int price;

    public Device(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws NegativeValue{
        if (price <= 0){
            throw new NegativeValue();
        }
        this.price = price;
    }

    public String printDeviceData(){
        return this.getBrand() + " " + this.getModel() + " " + this.getPrice();
    }
    public Device addDevice(String brand, String model, int price){
        return new Device(brand,model,price);
    }
}
