package model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private double credits;
    private String courseId;
    private final List<Major> majors;
    private final List<Student> students;
    private final List<Teacher> teachers;
    private double duration = 1.25;


    public Course(String name, String courseId, double credits) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        if (courseId == null) throw new IllegalArgumentException("CourseId cannot be null");
        if (credits < 1) throw new IllegalArgumentException("Credits cannot be negative");

        this.name = name;
        this.credits = credits;
        this.courseId = courseId;
        this.majors = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public Course(String name, String courseId, double credits, double duration) {
        this(name, courseId, credits);
        this.duration = duration;
    }


    protected void addMajor(Major major) {
        if (major == null) throw new IllegalArgumentException("Major cannot be null");
        this.majors.add(major);
    }


    protected void addStudent(Student student) {
        if (student == null) throw new IllegalArgumentException("Student cannot be null");
        this.students.add(student);
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }
}
