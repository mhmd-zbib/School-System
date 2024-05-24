package model;

import java.util.ArrayList;
import java.util.List;

public class Major {


    private String name;
    private int feePerCredit;
    private List<Course> courses;


    public Major(String name, int feePerCredit, List<Course> courses) {
        this.name = name;
        this.feePerCredit = feePerCredit;
        this.courses = new ArrayList<>();
     }


     public void addCourse(Course course) {
        this.courses.add(course);
     }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public int getFeePerCredit() {
        return feePerCredit;
    }
}
