package OOP_exersices.CustomExceptions2;

public class duplicateException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Duplicate auto";
    }
}
