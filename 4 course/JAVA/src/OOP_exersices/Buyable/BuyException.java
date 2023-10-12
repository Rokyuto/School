package Buyable;

public class BuyException extends RuntimeException{
    public String getMessage(){
        return "Quantity Invalid Value";
    }
}
