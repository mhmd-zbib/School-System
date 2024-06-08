package model;

import java.util.ArrayList;
import java.util.List;

/**
 * model.Student instance, keeping track of the
 * student's payment info
 */

public class Student extends User {
    private int gpa;
    private Major major;
    private final List<Course> courses;

    public Student(String name, String email, String password) {
        super(name, email, password);
        this.courses = new ArrayList<>();
    }

    public void setMajor(Major major) {
        if (major == null) throw new IllegalArgumentException("Major cannot be null");
        this.major = major;
        major.addStudent(this);
    }

    public void addCourse(Course course) {
        if (course == null) throw new IllegalArgumentException("Course cannot be null");
        if (!major.getCourses().contains(course)) throw new IllegalArgumentException("This course is not in the major");
        courses.add(course);
        course.addStudent(this);
    }

}
