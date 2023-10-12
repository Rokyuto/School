package OOP_exersices.CustomExceptions2;

public class serialNumberNotFoundException extends RuntimeException{

    @Override
    public String getMessage(){
        return "Auto with the given Engine Serial Number NOT FOUND";
    }

}
