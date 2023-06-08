package Building;

public class InvalidInputException extends RuntimeException{

    @Override
    public String getMessage(){
        return "Cannot set negative or 0 value";
    }
}
