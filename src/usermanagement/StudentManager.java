package usermanagement;

import model.Student;
import utils.EncryptionUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * The StudentManager class manages student's operations,
 * from signup to login and deleting accounts
 * to register and handling their own courses
 */

public class StudentManager {
    private List<Student> students = new ArrayList<Student>();

    public void signup(String name, String email, String password) throws IllegalArgumentException {
        StudentValidator.validateSignup(name, email, password);                 // calls the validator for validating the data
        String hashedPassword = EncryptionUtils.hashPassword(password);         // hash the password and return value
        Student newStudent = new Student(name, email, hashedPassword);          // initialize a new student class
        students.add(newStudent);                                               // add the class to the array
        System.out.println("New student added " + newStudent.getName());        // welcome the user
    }

    public List<Student>     getStudents() {
        return students;
    }

}