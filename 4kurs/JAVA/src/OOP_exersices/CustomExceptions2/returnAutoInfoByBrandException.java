package OOP_exersices.CustomExceptions2;

public class returnAutoInfoByBrandException extends RuntimeException{

    @Override
    public String getMessage(){
        return this.getMessage();
    }
}
