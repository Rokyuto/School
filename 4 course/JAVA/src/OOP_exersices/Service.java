package OOP_exersices.src;

import java.util.ArrayList;
import java.util.Scanner;

class Device{
    private String brand, model;
    private double prize;

    Device(String brand, String model, double prize){
        this.brand = brand;
        this.model = model;
        this.prize = prize;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }

    public void setPrize(double prize){
        this.prize = prize;
    }
    public double getPrize(){
        return this.prize;
    }

    public void inputMethodDevice(){
        Scanner myScanner = new Scanner(System.in);
        this.setBrand(myScanner.nextLine());
        this.setModel(myScanner.nextLine());
        this.setPrize(myScanner.nextDouble());

    }
    public void outMethodDevice(){
        System.out.println(this.getBrand() + this.getModel() + this.getPrize());
    }
}

class BrokenDevice extends Device {
    private String simptomi;
    private int repairTimeDays;

    BrokenDevice(String brand, String model, double prize, String simptomi, int repairTime){
        super(brand,model,prize);
        this.simptomi = simptomi;
        this.repairTimeDays = repairTime;
    }

    public void setSimptomi(String simptomi){
        this.simptomi = simptomi;
    }
    public String getSimptomi(){
        return this.simptomi;
    }

    public void setRepairTimeInDays(int time){
        this.repairTimeDays = time;
    }
    public double getRepairTimeInDays(){
        return this.repairTimeDays;
    }

    public static BrokenDevice inputMethodBrokenDevice(){
        Scanner inputScanner = new Scanner(System.in);
        return new BrokenDevice(inputScanner.nextLine(),inputScanner.nextLine(),inputScanner.nextDouble(),inputScanner.next(),inputScanner.nextInt());

    }
    public void outMethodBrokenDevice(){
        System.out.println(this.getBrand() + super.getModel() + super.getPrize() + this.getSimptomi() + this.getRepairTimeInDays());
    }

}

public class Service{

    ArrayList<Device> devices;
    ArrayList<BrokenDevice> brokenDevices;

    Service(ArrayList<Device> devices, ArrayList<BrokenDevice> brokenDevices){
        this.devices = devices;
        this.brokenDevices = brokenDevices;
    }

    public void inputMethod(){
        Scanner inputScan = new Scanner(System.in);

    }
    public void outMethod(){
        System.out.println();
    }

    public void addNewDevice(Device newDevice){
        devices.add(newDevice);
    }

    public void addNewBrokenDevice(BrokenDevice brokenDevice){
        brokenDevices.add(brokenDevice);
    }
    public void repairDevice(BrokenDevice repairedDevice){
        brokenDevices.remove(repairedDevice);
        devices.add(repairedDevice);
    }

    public void printDevicesWithSimptom(String simptom){
        for(BrokenDevice currentBrokenDevice : brokenDevices){
            if(currentBrokenDevice.getSimptomi().equals(simptom)){
                currentBrokenDevice.outMethodBrokenDevice();
            }
        }
    }

    public double calculateBenefits(double prize){
        int benefit = 0, count = 0;
        for(BrokenDevice currentBrokenDevice : brokenDevices){
            if(currentBrokenDevice.getPrize() == prize){
                benefit+=currentBrokenDevice.getPrize();
                count++;
            }
        }
        benefit /= count;
        System.out.println(benefit);
        return benefit;
    }

    public static void main(String[] args) {
        Device device1 = new Device("Acer ","Nitro 5 ",1700);
        Device device2 = new Device("MSI ","Rock ",2000);
        Device device3 = new Device("Asus ","Tuf F15 ",2700);

        BrokenDevice brokenDevice1 = new BrokenDevice("Alienware ","112 ",3000,"battery",1);
        BrokenDevice brokenDevice2 = new BrokenDevice("Acer ","Aspire ",1500,"battery",2);
        BrokenDevice brokenDevice3 = new BrokenDevice("Lenovo ","Legion ",3000," broken screen ",1);

        ArrayList<Device> devices = new ArrayList<>();
        devices.add(device1);
        devices.add(device2);

        device3.outMethodDevice();
        device3.inputMethodDevice();
        device3.outMethodDevice();

        ArrayList<BrokenDevice> brokenDevices = new ArrayList<>();
        brokenDevices.add(brokenDevice1);
        brokenDevices.add(brokenDevice2);
        brokenDevices.add(brokenDevice3);

        brokenDevice3.outMethodBrokenDevice();
        BrokenDevice brokenDevice4 = BrokenDevice.inputMethodBrokenDevice();
        brokenDevice4.outMethodBrokenDevice();

        Service service = new Service(devices,brokenDevices);
        service.addNewDevice(device3);
        service.addNewBrokenDevice(brokenDevice4);

        service.repairDevice(brokenDevice3);

        service.printDevicesWithSimptom("battery");

        service.calculateBenefits(3000);

    }

}