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
    private final List<Section> sections;

    public Student(String name, String email, String password, Major major) {
        super(name, email, password);
        this.courses = new ArrayList<>();
        this.sections = new ArrayList<>();
        this.major = major;
    }

    public void setMajor(Major major) {
        if (major == null) throw new IllegalArgumentException("Major cannot be null");
        this.major = major;
        major.addStudent(this);
    }


    public void enrollInSection(Section section) {
        if (section == null) throw new IllegalArgumentException("Section cannot be null");
        courses.add(section.getCourse());
        sections.add(section);
        section.addStudent(this);
    }


    public List<Course> getCourses() {
        return courses;
    }
}
