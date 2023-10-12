package OOP_exersices.src;

public class Laptop extends L_Device {

    private int ramSize, hardDriveSize;

    Laptop(int zahranvane , String processor ,int ramSize, int hardDriveSize){
        super(zahranvane,processor);
        this.ramSize = ramSize;
        this.hardDriveSize = hardDriveSize;
    }

    public int getRamSize(){
        return this.ramSize;
    }

    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }

    public int getHardDriveSize(){
        return this.hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize){
        this.hardDriveSize = hardDriveSize;
    }

    public boolean isBetter(Laptop laptop2) {
        return this.ramSize > laptop2.ramSize && this.hardDriveSize > laptop2.hardDriveSize;
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(350,"i9-10900",64,512);
        Laptop laptop2 = new Laptop(250,"i5-10900",32,280);

        System.out.println("Laptop1: " + laptop1.getZahranvane() + " " + laptop1.getProcessor() + " " + laptop1.getRamSize() + " " + laptop1.getHardDriveSize());
        System.out.println("Laptop2: " + laptop2.getZahranvane() + " " + laptop2.getProcessor() + " " + laptop2.getRamSize() + " " + laptop2.getHardDriveSize());

        System.out.println(laptop1.isBetter(laptop2));

        laptop1.setRamSize(32);
        laptop1.setHardDriveSize(580);
        laptop2.setRamSize(128);
        laptop2.setHardDriveSize(1000);

        System.out.println("Laptop1: " + laptop1.getZahranvane() + " " + laptop1.getProcessor() + " " + laptop1.getRamSize() + " " + laptop1.getHardDriveSize());
        System.out.println("Laptop2: " + laptop2.getZahranvane() + " " + laptop2.getProcessor() + " " + laptop2.getRamSize() + " " + laptop2.getHardDriveSize());

        System.out.println(laptop1.isBetter(laptop2));
    }

}

class L_Device {

    private int zahranvane;
    private String processor;

    L_Device(int zahranvane, String processor) {
        this.zahranvane = zahranvane;
        this.processor = processor;
    }

    public int getZahranvane() {
        return this.zahranvane;
    }

    public void setZahranvane(int zahranvane) {
        this.zahranvane = zahranvane;
    }

    public String getProcessor() {
        return this.processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void turnOn() {
        System.out.println("Turn On");
    }

    public void turnOff() {
        System.out.println("Turn Off");
    }

}
