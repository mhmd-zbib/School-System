package model;

import java.util.List;

/**
 * model.Student instance, keeping track of the
 * student's payment info
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private Major major;
    private List<Course> courses;
    private int feesPaid;
    private int feesTotal;



    /**
     * @param id        Unique id
     * @param name      set on create
     * @param grade     set by calculating their courses
     * @param feesPaid  calculated by what was paid
     * @param feesTotal depending on courses took
     */
    public Student(int id, String name, int grade, int feesPaid, int feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;

    }


}
