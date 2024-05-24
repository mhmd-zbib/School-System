package model;

public class Course {

    private String name;
    private double credits;
    private String courseId;


    public Course(String name, double credits , String courseId) {
        this.name = name;
        this.credits = credits;
        this.courseId = courseId;
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

    public String getCourseId() {
        return courseId;
    }

}
