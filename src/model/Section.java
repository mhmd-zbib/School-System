package model;

import enums.Days;

import java.util.ArrayList;
import java.util.List;

public class Section {

    private char name;
    private CourseClass courseClass;
    private double startTime;
    private double endTime;
    private Course course;
    private List<Days> days;
    private final List<Student> students;


    public Section(char name, CourseClass courseClass, Course course, double startTime, List<Days> days) {
        this.name = name;
        this.courseClass = courseClass;
        this.startTime = startTime;
        this.days = days;
        this.course = course;
        this.endTime = startTime + this.course.getDuration();
        this.students = new ArrayList<>();

    }

    protected void addStudent(Student student) {
        if (students.contains(student)) throw new IllegalArgumentException("Student already exists");
        if (students.size() >= courseClass.getSeats()) throw new IllegalArgumentException("No more seats!");

        students.add(student);

    }


    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Section" +
                "name=" + name +
                ", courseClass=" + courseClass.getName() +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", course=" + course.getName() +
                ", days=" + days
                ;
    }
}
