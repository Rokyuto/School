package OOP_lectures.src.ClassesObjects;
import java.util.ArrayList;

// Car class
class Car{

    // Fields
    String brand, model,color;
    double engineHp;

    // Constructor
    Car(String brand, String model,String color,double engineHp){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineHp = engineHp;
    }
}

public class ClassObjectsLessonExercises {
    public static void main(String[] args) {
        // Create Car Objects (Car Class Instances)
        Car car1 = new Car("Dodge","Challenger","red",300);
        Car car2 = new Car("Dodge","Charger","purple",250);
        Car car3 = new Car("Nissan","Skyline","blue",275);

        // Array List with Car Objects
        ArrayList<Car> carCollection = new ArrayList<>();
        carCollection.add(car1);
        carCollection.add(car2);
        carCollection.add(car3);

        // Call method who return only Car objects which brand is equal to entered
        checkCarBrand(carCollection,"Nissan");

    }

    // Method who returns List with Filtered Car Objects
    public static ArrayList<Car> checkCarBrand(ArrayList<Car> carList, String carBrand) {
        ArrayList<Car> brandCars = new ArrayList<>(); // List with filtered Car Objects
        for (Car car : carList) { // For each
            if (car.brand.equals(carBrand)){ // Compare Brands
                brandCars.add(car); // Add to filter Car Objects List
            }
        }
        return brandCars;
    }

    // Method who returns Array with Filtered Car Objects
    public static Car[] checkCarBrand(Car[] carArray, String carBrand){
        // When create array we must set him size (length)
        // We can overfill array, so we must be careful
        // To avoid this we do:
        Car[] brandCars = new Car[carArray.length]; // TabNine automatically show it to us as option
        int brandCarsCount = 0; // Counter for Cars that mach carBrand
        for (Car car : carArray) {
            if (car.brand.equals(carBrand)){
                brandCars[brandCarsCount] = car;
                brandCarsCount++;
            }
        }
        return brandCars;
    }

}
