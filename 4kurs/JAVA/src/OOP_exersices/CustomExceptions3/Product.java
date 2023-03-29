package OOP_exersices.CustomExceptions3;

public abstract class Product {
    private String inventoryNumber;
    private double price, quantity;
    private Provider provider;

    public Product(String inventoryNumber, double price, double quantity, Provider provider) {
        this.inventoryNumber = inventoryNumber;
        this.price = price;
        this.quantity = quantity;
        this.provider = provider;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public abstract double getPromotionalPrice();
    public abstract boolean sellProduct(int piece) throws NoMoreProductsException;
}
