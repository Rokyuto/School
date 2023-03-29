package OOP_exersices.CustomExceptions3;

public class NoMoreProductsException extends Exception{
    @Override
    public String getMessage(){
        return "No more products";
    }
}
