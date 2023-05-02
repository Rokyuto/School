package Buyable;
public class Product implements Buyable{

    private int id,quantity;
    private final String name;

    public Product(int id, int quantity, String name) {
        setId(id);
        setQuantity(quantity);
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id){
        try {
            if (id >= 0) {
                this.id = id;
            }
            else{
                throw new MismatchInput();
            }
        }
        catch (MismatchInput e){
            System.err.println(e.getMessage());
        }
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        try {
            if (quantity >= 0) {
                this.quantity = quantity;
            }
            else{
                throw new MismatchInput();
            }
        }
        catch (MismatchInput e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public int buy(int quantity) {
        if(quantity <=0) {
            return -1;
        }
        if (getQuantity() >= quantity){
            setQuantity(getQuantity() - quantity);
            return getId();
        }
        else{
            return -1;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}