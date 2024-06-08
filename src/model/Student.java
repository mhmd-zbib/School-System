package model;

import interfaces.Payable;

import java.util.List;

/**
 * model.Student instance, keeping track of the
 * student's payment info
 */

public class Student extends User implements Payable {
    private int gpa;
    private Major major;
    private List<Course> courses;
    private int feesPaid;
    private int feesTotal;


    public Student(String name, String email, String password, int id) {
        super(name, email, password, id);
     }

    @Override
    public void payFees(int amount) {
        feesPaid += amount;
    }

    @Override
    public boolean checkPaymentStatus() {
        return false;
    }
}
