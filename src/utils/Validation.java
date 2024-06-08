package utils;

import java.util.List;
import java.util.regex.*;


/**
 * validation checkers
 */
public class Validation {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";


    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX); // its a setter for the regex how it looks like
        Matcher matcher = pattern.matcher(email); // its looks inside the email and checks if its good matching or not
        return matcher.matches(); // returns boolean of the thing if it matcehs or not
    }


    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }


    public static boolean checkExistence(String entity, List<String> list) {
        for (String s : list) {
            if (entity.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
