package Buyable;

public class BetterProduct extends Product{
    public BetterProduct(int id, int quantity, String name) {
        super(id, quantity, name);
    }

    @Override
    public int buy(int quantity) throws BuyException{
        if(quantity <=0) {
            throw new BuyException();
        }
        if (getQuantity() >= quantity){
            setQuantity(getQuantity() - quantity);
            return getId();
        }
        else{
            throw new BuyException();
        }
    }
}

