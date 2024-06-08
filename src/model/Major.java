package model;

import java.util.ArrayList;
import java.util.List;

public class Major {
    private String name;
    private int feePerCredit;
    private List<Course> courses;
    private List<Student> students;

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

    public void addStudent(Student student) {
        if (student == null) throw new IllegalArgumentException("Student cannot be null");
        if (students.contains(student)) throw new IllegalArgumentException("Student already exists");
        this.students.add(student);
    }


    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        this.name = name;
    }

    public int getFeePerCredit() {
        return feePerCredit;
    }

    public void setFeePerCredit(int feePerCredit) {
        if (feePerCredit == 0) throw new IllegalArgumentException("Fee per credit cannot be zero");
        this.feePerCredit = feePerCredit;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Major{" + "name='" + name + '\'' + ", feePerCredit=" + feePerCredit + ", courses=" + courses + '}';
    }

}
