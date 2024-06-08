package model;

import java.util.List;

/**
 * model.Student instance, keeping track of the
 * student's payment info
 */

public class Student extends User {
    private int gpa;
    private Major major;
    private List<Course> courses;

    public Student(String name, String email, String password) {
        super(name, email, password);
    }

    public void setMajor(Major major) {
        if (major == null) throw new IllegalArgumentException("Major cannot be null");
        this.major = major;
        major.addStudent(this);
    }
}
