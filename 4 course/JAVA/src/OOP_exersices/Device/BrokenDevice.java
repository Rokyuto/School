public class BrokenDevice extends Device{
    private String symptoms;
    private int repairTime;

    public BrokenDevice(String brand, String model, int price, String symptoms, int repairTime) {
        super(brand, model, price);
        this.symptoms = symptoms;
        this.repairTime = repairTime;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(int repairTime) throws NegativeValue {
        if (repairTime <= 0){
            throw new NegativeValue();
        }
        this.repairTime = repairTime;
    }

    public String printBrokenDeviceData(){
        return this.getBrand() + " " + this.getModel() + " " + this.getPrice() + " " + this.getSymptoms() + " " + this.getRepairTime();
    }
    public BrokenDevice addBrokenDevice(String brand, String model, int price,String symptom,int repairTime){
        return new BrokenDevice(brand,model,price,symptom,repairTime);
    }
}
