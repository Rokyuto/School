package OOP_exersices.CustomExceptions2;

public class Auto {
    private String brand,model,year,fuel,engineSerialNumber;
    private int price;


    public Auto(String brand, String model, String year, String fuel, String engineSerialNumber, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.engineSerialNumber = engineSerialNumber;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngineSerialNumber() {
        return engineSerialNumber;
    }

    public void setEngineSerialNumber(String engineSerialNumber) {
        this.engineSerialNumber = engineSerialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String printAutoInfo(){
        return this.getBrand() + " "
                + this.getModel() + " "
                + this.getYear() + " "
                + this.getPrice() + " "
                + this.getFuel() + " "
                + this.getEngineSerialNumber();
    }
}
