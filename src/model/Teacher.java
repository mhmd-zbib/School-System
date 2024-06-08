package model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {


    private final List<Course> courses;
    private final List<CourseClass> courseClasses;
    private int salary;


    public Teacher(String name, String password, String email) {
        super(name, password, email);
        this.courses = new ArrayList<>();
        this.courseClasses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }




    public int getSalary() {
        return salary;
    }
}
