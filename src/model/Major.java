package model;

import java.util.ArrayList;
import java.util.List;

public class Major {
    private String name;
    private int feePerCredit;
    private final List<Course> courses;
    private final List<Student> students;

    public Major(String name, int feePerCredit) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        if (feePerCredit <= 0) throw new IllegalArgumentException("Fee per credit cannot be negative or zero");

        this.name = name;
        this.feePerCredit = feePerCredit;
        this.courses = new ArrayList<Course>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        if (courses == null) throw new IllegalArgumentException("Course cannot be null");
        if (courses.contains(course)) throw new IllegalArgumentException("Course already exists");
        this.courses.add(course);
        course.addMajor(this);
    }

    protected void addStudent(Student student) {
        if (student == null) throw new IllegalArgumentException("Student cannot be null");
        if (students.contains(student)) throw new IllegalArgumentException("Student already exists");
        this.students.add(student);
    }


    public List<Course> getCourses() {
        return courses;
    }


}
