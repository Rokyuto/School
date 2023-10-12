package OOP_exersices.CustomExceptions3;

public class Book extends Product{
    private String author, title;

    public Book(String inventoryNumber, double price, double quantity, Provider provider,String author, String title) {
        super(inventoryNumber, price, quantity, provider);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPromotionalPrice() {
        return this.getPrice() * 0.5;
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
