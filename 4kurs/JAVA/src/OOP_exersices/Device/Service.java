import java.util.ArrayList;

public class Service {

    private ArrayList<Device> healthyDevices;
    private ArrayList<BrokenDevice> brokenDevices;

    public Service(ArrayList<Device> healthyDevices, ArrayList<BrokenDevice> brokenDevices) {
        this.healthyDevices = healthyDevices;
        this.brokenDevices = brokenDevices;
    }

    public ArrayList<Device> getHealthyDevices() {
        return healthyDevices;
    }

    public void setHealthyDevices(ArrayList<Device> healthyDevices) {
        this.healthyDevices = healthyDevices;
    }

    public ArrayList<BrokenDevice> getBrokenDevices() {
        return brokenDevices;
    }

    public void setBrokenDevices(ArrayList<BrokenDevice> brokenDevices) {
        this.brokenDevices = brokenDevices;
    }

    public Device addDevice(String brand, String model, int price){
        return new Device(brand, model, price);
    }

    public String returnDeviceData(Device device){
        return device.printDeviceData();
    }

    public BrokenDevice addBrokenDevice(String brand, String model, int price,String symptom,int repairTime){
        return new BrokenDevice(brand,model,price,symptom,repairTime);
    }

    public String returnBrokenDeviceData(BrokenDevice brokenDevice){
        return brokenDevice.printBrokenDeviceData();
    }

    public ArrayList<Device> addDevice(Device newDevice){
        this.getHealthyDevices().add(newDevice);
        return this.getHealthyDevices();
    }

    public ArrayList<BrokenDevice> addBrokenDevice(BrokenDevice newBrokenDevice){
        this.getBrokenDevices().add(newBrokenDevice);
        return this.getBrokenDevices();
    }

    public void repairDevice(BrokenDevice repairedDevice){
        this.getBrokenDevices().remove(repairedDevice);
        this.getHealthyDevices().add(repairedDevice);
    }

    public void printAllDevicesWithSameSymptom(String symptom){
        for (BrokenDevice brokenDevice : this.getBrokenDevices()) {
            if (brokenDevice.getSymptoms().equals(symptom)){
                System.out.println(brokenDevice.printBrokenDeviceData());
            }
        }
    }

    public int calcDevicesSum(){
        int sum = 0;
        for (Device device : this.getHealthyDevices()){
            sum += device.getPrice();
        }
        return sum;
    }

    public int calcIncomeFromBrokenDevices(int price) throws NegativeValue,ZeroDevices{
        if (price <= 0){
            throw new NegativeValue();
        }
        int sum = 0;
        int devicesCount = 0;
        for (BrokenDevice brokenDevice : this.getBrokenDevices()){
            if (brokenDevice.getPrice() == price){
                sum += brokenDevice.getPrice();
                devicesCount++;
            }
        }
        if (devicesCount == 0){
            throw new ZeroDevices();
        }
        return sum / devicesCount;
    }

}
