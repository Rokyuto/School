package Buyable;

public class MismatchInput extends RuntimeException{

    @Override
    public String getMessage(){
        return "The input for ID or Quantity is below 0";
    }
}
