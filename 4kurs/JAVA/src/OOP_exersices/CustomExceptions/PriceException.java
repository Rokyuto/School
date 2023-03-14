package OOP_exersices.CustomExceptions;

public class PriceException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Cenata e < 0";
    }

}
