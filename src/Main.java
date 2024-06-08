import enums.Days;
import model.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Days> days = new ArrayList<>();
        days.add(Days.MONDAY);
        days.add(Days.WEDNESDAY);



        Major csci = new Major("Computer Science", 170);
        Course prog = new Course("Intro to programming", "CSCI210", 3);
        Course prog2 = new Course("Intro to programming II", "CSCI250", 3);
        CourseClass class502D = new CourseClass(5, 2, 'D', 55);

        Section csci_prog_class502D = new Section('A', class502D, prog, 9, days);
        Section csci_progII_class502D = new Section('J', class502D, prog2, 11, days);


        Student mimi = new Student("Mohammad", "mohammad@gmail.com", "zahraa123", csci);

        mimi.enrollInSection(csci_prog_class502D);
        mimi.enrollInSection(csci_progII_class502D);

        for (Course courses : mimi.getCourses()) {
            System.out.println(courses.getName());
        }


    }
}