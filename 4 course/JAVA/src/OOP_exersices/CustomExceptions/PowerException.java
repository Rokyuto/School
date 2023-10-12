package OOP_exersices.CustomExceptions;

public class PowerException extends RuntimeException {

    @Override
    public String getMessage() {
        return "PowerException";
    }

}
