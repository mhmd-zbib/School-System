package usermanagement;

import model.Student;
import utils.Validation;

public class StudentValidator  {


    public static void validateSignup(String name, String email, String password) throws IllegalArgumentException {
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Fill all the fields");
        }

        if (!Validation.validateEmail(email)) {
            throw new IllegalArgumentException("Email is not valid");
        }

        if (!Validation.validatePassword(password)) {
            throw new IllegalArgumentException("Password is not valid");
        }


    }
}
