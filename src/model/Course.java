package model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private double credits;
    private   String courseId;
    private final List<Major> majors;


    public Course(String name, String courseId, double credits) {

        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        if (courseId == null) throw new IllegalArgumentException("CourseId cannot be null");
        if (credits < 1) throw new IllegalArgumentException("Credits cannot be negative");

        this.name = name;
        this.credits = credits;
        this.courseId = courseId;
        this.majors = new ArrayList<Major>();
    }


    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public List<Major> getMajors() {
        return majors;
    }

    protected void addMajor(Major major) {
        if (major == null) throw new IllegalArgumentException("Major cannot be null");
        this.majors.add(major);
    }
}
