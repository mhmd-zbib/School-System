package services;

import interfaces.PaymentServiceInt;
import model.Student;

public class PaymentService implements PaymentServiceInt {

    @Override
    public void payFees(Student student, int amount) {

    }

    @Override
    public boolean checkPaymentStatus(Student student) {
        return false;
    }
}





