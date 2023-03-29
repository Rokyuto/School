package OOP_exersices.CustomExceptions2;

import java.util.ArrayList;

public class Ad {
    private ArrayList<Auto> autoList;

    public Ad(){
        autoList = new ArrayList<>();
    }


    public ArrayList<Auto> getAutoList() {
        return autoList;
    }

    public void setAutoList(ArrayList<Auto> autoList) {
        this.autoList = autoList;
    }

    public void addAutoToList(Auto auto) throws duplicateException{
        if (!getAutoList().contains(auto)){
            getAutoList().add(auto);
        }
        else{
            throw new duplicateException();
        }
    }

    public void removeAutoByEngineSerialNumber(String serialNumber) throws serialNumberNotFoundException{
        for (Auto currentAuto : getAutoList()){
            if (currentAuto.getEngineSerialNumber().equals(serialNumber)){
                getAutoList().remove(currentAuto);
                return;
            }
        }
        throw new serialNumberNotFoundException();
    }

    public String returnAutoInfoByBrand(String brand) throws returnAutoInfoByBrandException{
        for (Auto currentAuto : getAutoList()){
            if (currentAuto.getBrand().equals(brand)){
                return currentAuto.printAutoInfo();
            }
        }
        for (Auto currentAuto : getAutoList()){
            return currentAuto.printAutoInfo();
        }
        throw new returnAutoInfoByBrandException();
    }

    public String returnMostExpensiveAuto(){
        int biggestPrice = 0;
        Auto expensiveAuto = getAutoList().get(0);
        for (Auto currentAuto : getAutoList()){
            if (currentAuto.getPrice() > biggestPrice){
                biggestPrice = currentAuto.getPrice();
                expensiveAuto = currentAuto;
            }
        }
        return expensiveAuto.printAutoInfo();
    }

    public static void main(String[] args) {
        Ad ad = new Ad();
        Auto auto1 = new Auto("Dodge","Challenger","2018","Diesel","b214e6",75000);
        Auto auto2 = new Auto("Nissan","Skyline","2013","Diesel","a98z45d",60000);
        Auto auto3 = new Auto("Toyota","Supra","200","Benzin","p4587t3",20000);
        ad.addAutoToList(auto1);
        ad.addAutoToList(auto2);
        ad.addAutoToList(auto3);

        ad.addAutoToList(auto1);
        ad.removeAutoByEngineSerialNumber("");
        ad.removeAutoByEngineSerialNumber("bholhnavsd");
        ad.removeAutoByEngineSerialNumber("p4587t3");

        ad.returnAutoInfoByBrand("Dodge");
        ad.returnAutoInfoByBrand("");

        ad.returnMostExpensiveAuto();

    }
}
