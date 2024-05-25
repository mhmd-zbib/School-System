package model;

import java.util.List;

/**
 * model.Student instance, keeping track of the
 * student's payment info
 */

public class Student {

    private int id;
    private String name;
    private String email;
    private String password;
    private int grade;
    private Major major;
    private List<Course> courses;
    private int feesPaid;
    private int feesTotal;


    public Student(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}
