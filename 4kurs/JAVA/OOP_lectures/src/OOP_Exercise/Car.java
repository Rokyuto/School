package OOP_Exercise;

import java.util.ArrayList;
import java.util.Arrays;

class Car {
    private String brand,model,owner;
    private float power,price;

    Car(String brand,String model,String owner,float power,float price) {
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.power = power;
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


    public String getOwner() {
        return model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getPower() {
        return power;
    }

    public void setModel(float power) {
        this.power = power;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}

class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Dodge","Challenger","Viktor",300,60000);
        Car car2 = new Car("Dodge","Charger","Mitko",250,50000);
        Car car3 = new Car("Nissan","Skyline","Mitchov",275,550000);

        // Array List with Car Objects
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);

        getBrandCars(carsList, "Dodge");
        getMostPowerfulCar(carsList,"Dodge");
        getAverageBrandPrice(carsList,"Dodge");

    }

    public static ArrayList<Car> getBrandCars(ArrayList<Car> cars, String brand){
        ArrayList<Car> brandCarsList = new ArrayList<>();
        for(Car currentCar : cars){
            if(currentCar.getBrand().equals(brand)){
                brandCarsList.add(currentCar);
            }
        }
        return brandCarsList;
    }

    //public static float getMostPowerfulCar(ArrayList<Car> cars,String brand){
    public static float getMostPowerfulCar(ArrayList<Car> cars,String brand){
        float biggestPower = 0;
        for(Car currentCar : cars){
            if(currentCar.getBrand().equals(brand) && currentCar.getPower() > biggestPower){
                biggestPower = currentCar.getPower();
                System.out.println(biggestPower);
            }
        }
        return biggestPower;
    }

    public static float getAverageBrandPrice(ArrayList<Car> cars,String brand){
        float brandCarsPrice = 0;
        int counter = 0;
        for(Car currentCar : cars){
            if(currentCar.getBrand().equals(brand)){
                brandCarsPrice += currentCar.getPrice();
                counter++;
            }
        }
        return brandCarsPrice / counter;
    }

}
