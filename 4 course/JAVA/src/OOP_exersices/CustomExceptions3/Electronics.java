package OOP_exersices.CustomExceptions3;

public class Electronics extends Product{
    private String manufacturer, model;

    public Electronics(String inventoryNumber, double price, double quantity, Provider provider, String manufacturer, String model) {
        super(inventoryNumber, price, quantity, provider);
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getPromotionalPrice() {
        return this.getPrice() * 0.1;
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        if (this.getQuantity() - piece > 0){
            this.setQuantity(this.getQuantity() - piece);
            return true;
        }
        else {
            throw new NoMoreProductsException();
        }
    }

}
