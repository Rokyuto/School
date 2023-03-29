package OOP_exersices.CustomExceptions3;

public class WrongPhoneNumberException extends Exception{
    @Override
    public String getMessage(){
        return "Wrong Phone Number";
    }
}
