package model;

import java.util.ArrayList;
import java.util.List;

public class Section {

    private String name;
    private CourseClass courseClass;
    private List<Lecture> lectureList;
    private String startTime;


    public Section(String name, CourseClass courseClass, List<Lecture> lectureList) {
        this.name = name;
        this.courseClass = courseClass;
        this.lectureList = new ArrayList<>(lectureList);
    }


}
