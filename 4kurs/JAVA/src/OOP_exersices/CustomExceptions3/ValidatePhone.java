package OOP_exersices.CustomExceptions3;

import java.util.regex.Pattern;

public interface ValidatePhone {
    static boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if (phoneNumber.length() == 10 && Pattern.compile("[0-9]*").matcher(phoneNumber).matches()){ // phoneNumber.contains("\\[a-zA-Z]\\")
            return true;
        }
        else {
            throw new WrongPhoneNumberException();
        }
    }
}
